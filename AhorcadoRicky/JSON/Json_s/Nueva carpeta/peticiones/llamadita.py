import random
import requests #Para hacer llamadas a la API
import matplotlib.pyplot as plt
from PIL import Image
from io import BytesIO
import translate

traductor = translate.Translator(to_lang="es")
letrasOcultas = []
def llamadaApi():
    pokedex = ("https://pokeapi.co/api/v2/pokemon/")
    pokemon = random.randint(1,1302)
    contenidoWeb = requests.get(f"{pokedex}{pokemon}")
    code = contenidoWeb.status_code
    print(code)
    pokemon = contenidoWeb.json()
    #for c,v in pokemon.items():
    #    print(traductor.translate(f"{c}:{v}"))
    return pokemon
def obtenerPokemon(api):
    return api["name"]
def primeraPista(api):
    print("Pista 1: \n "
          "Para continuar jugando, cierre la pestaña de la imagen")
    url = api["sprites"]["front_default"]
    respuesta = requests.get(url)
    imagen = Image.open(BytesIO(respuesta.content))
    plt.imshow(imagen)
    plt.axis('off')
    plt.show()
def segundaPista(api):
    print("Pista 2: \n")
    tiposPokemon = api["types"]
    tipos = []
    for tipo in tiposPokemon:
        tipos.append(traductor.translate(tipo["type"]["name"]))

    print(f"Los tipos del pokemon son {tipos}")
def terceraPista(api):
    print("Pista 3: \n")
    especie = api["species"]["url"]
    datosApi = requests.get(especie)
    infoEspecie = datosApi.json()
    color_pokemon = traductor.translate(infoEspecie["color"]["name"])
    print(f"El color del pokemon es {color_pokemon}")
#Pista 4: A partir del for tuve que pedir ayuda de la IA.
def cuartaPista():
    print("Pista 4:\n")
    especie = api["species"]["url"]
    datosApi = requests.get(especie)
    infoEspecie = datosApi.json()
    textoTraducido = ""
    for texto in infoEspecie["flavor_text_entries"]:
        #De no comprobarn si el lenguaje está en inglés, se imprimirá el contenido
        #del texto en el que se encuentre.
        if texto["language"]["name"] == "en":
            textoTraducido = traductor.translate(texto["flavor_text"])
            break

    print(f"Texto: \n {textoTraducido}")
def menuPistas():
    pista = input("¿Deseas obtener alguna pista? s/n\n")
    if pista.lower() == "s":
        print("Pista 1: Imágen Pokemon\n"
              "Pista 2: Tipo/s de Pokemon\n"
              "Pista 3: Color del Pokemon\n"
              "Pista 4: Información del Pokemon\n")
        opcionesValidas = ["1", "2", "3", "4"]
        enumeracionPista = input("¿Qué pista desea obtener 1,2,3 o 4?")
        while enumeracionPista not in opcionesValidas:
            print("Introduce una opción válida")
            enumeracionPista = input("¿Qué pista desea obtener 1,2,3 o 4?\n")
        if enumeracionPista == "1":
            primeraPista(api)
        elif enumeracionPista == "2":
            segundaPista(api)
        elif enumeracionPista == "3":
            terceraPista(api)
        elif enumeracionPista == "4":
            cuartaPista()
def juegoDelAhorcado(nombrePokemon):
    #print(f"El nombre del pokemon es {nombrePokemon}")
    intentos = 5
    longitud = len(nombrePokemon)
    print(f"La palabra contiene {longitud} letras.")
    letrasOcultas = []
    for letra in nombrePokemon:
        letrasOcultas.append("_")
    letrasCorrectas = []
    letrasIncorrectas = []
    while intentos > 0 and "_" in letrasOcultas:
        print(f"Palabra:\n {letrasOcultas}\n"
              f"Letras correctas:\n {letrasCorrectas}\n"
              f"Letras incorrectas:\n {letrasIncorrectas}")
        print(nombrePokemon)
        respuesta = input("¿Dime una letra o el nombre completo del pokemon?\n😡").lower()
        if respuesta == nombrePokemon:
            print("🥰😍WOW, Has acertado🥰😍")
            intentos = 0

        if intentos != 0 and respuesta in pokemon:
            for letra in respuesta:
                letrasCorrectas.append(letra)
            for i in range(len(pokemon)):
                if pokemon[i] == respuesta:
                    letrasOcultas[i] = respuesta
            print("😱¡Bien!😱")
            menuPistas()
        elif respuesta not in pokemon:
            letrasIncorrectas.append(respuesta)
            print(f"Letra incorrecta, te quedan {intentos-1} intentos.🥵")
            intentos -= 1
            menuPistas()

pregunta = input("¿Desea comenzar a jugar s/n?\n")

while pregunta.lower() == "s":
    api = llamadaApi()
    pokemon = obtenerPokemon(api)
    juegoDelAhorcado(pokemon)
    pregunta = input("¿Desea seguir jugando s/n?\n")
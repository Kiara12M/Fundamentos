import random
import image
import requests
from PIL import Image #para las fotos
from io import BytesIO #Para las fotos

###############################################################
# Sacar la info de la API

apiRickyMorty = "https://rickandmortyapi.com/api/character/"
personaje = random.randint(1, 826)                          #-->Va a sacar un personaje de lo s826 que hay.
contenidoWeb = requests.get(f"{apiRickyMorty}{personaje}")        #-->LLama a ambos, pero llamamos tambien al personaje para que me escupa solo el random elegido
personaje = contenidoWeb.json()                                   #-->Para tenerlo guardado el personaje llamado y su información
print(personaje)

################################################################
# Sacar lo que queremos saber de lo que esté en la API, sus etiquetas

objeto = personaje

nombre = objeto["name"]
especie = objeto["species"]
tipo = objeto["type"]
genero = objeto["gender"]
foto = objeto["image"] #--------------------------------------------------------
respuesta_img=requests.get(foto) #para abrir la foto
imagen=Image.open(BytesIO(respuesta_img.content))
imagen.show()## ----------------------------------------------------------------------
print(nombre)

####################################################################
# AHORCADO

print(f"Ahorcado de Rick y Morty!\n"
      f"Adivina el personaje a partir de estas pistas: {especie}, {tipo} y {genero}. \n"
      f"Tienes 6 intentos (Los espacios cuentan como palabras)")

contador = 0

personaje_oculto = []
for i in range(len(nombre)):
    personaje_oculto.append("_")

print(f"Nombre:{personaje_oculto}")


while contador < 6 and "_" in personaje_oculto:
    print(f"Intentos: {contador}")
    letra = (input(f"Introduce una letra: "))#no me lee las mayusculas como minusculas y si le pongo .lower me salta que esta mal

    if letra in nombre:
        print("Letra correcta!")
        for i in range(len(nombre)):
            if nombre[i] == letra:
                personaje_oculto[i] = letra
                print("Nombre:"," ".join(personaje_oculto))  #-->La forma que te aparece el ahorcado
    else:
        contador += 1
        print("Incorrecto!")


if "_" not in personaje_oculto:
    print(f"Has ganado! El personaje oculto es: {nombre}")
else:
    print(f"Has perdido! El personaje oculto era: {nombre}")
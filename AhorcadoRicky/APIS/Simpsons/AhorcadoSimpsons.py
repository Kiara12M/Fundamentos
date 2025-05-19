import requests
from PIL import Image
from io import BytesIO

###############################################################
# Sacar la info de la API

urlSimpsons = "https://thesimpsonsquoteapi.glitch.me/quotes"
respuesta = requests.get(urlSimpsons)
contenido = respuesta.json()
#print(contenido)

################################################################
# Sacar lo que queremos saber de lo que esté en la API, sus etiquetas

objeto = contenido[0]

frase = objeto["quote"]
personaje = objeto["character"]
foto=objeto["image"]
respuesta_img=requests.get(foto)
imagen=Image.open(BytesIO(respuesta_img.content))
imagen.show()
#print(personaje)

####################################################################
# AHORCADO

print(f"Ahorcado de los Simpsons!\n"
      f"Adivina el personaje a partir de la frase:\n"
      f"{frase}\n"
      f"(Tienes 6 intentos)")

contador_intentos = 0

personaje_oculto = []                         #-->Hacer Array para ocultar personaje a rayitas, pa que no se vea
for i in range(len(personaje)):               #-->Recorre el personaje
    personaje_oculto.append("_")              #-->El append es para meter el personaje en personaje oculto
print(personaje_oculto)

while contador_intentos < 6 and "_" in personaje_oculto:   #-->Usamos while porqu no sabemos cuanto tardaran en adivinar
    print(f"Intentos: {contador_intentos}")
    letra = input("Introduce una letra: ")

    if letra in personaje:                    #-->Si la letra está en personaje
        for i in range(len(personaje)):
            if personaje[i] == letra:
                personaje_oculto[i] = letra
                print("Correcto, letra aceptada!")
                print(f"Nombre: {personaje_oculto}")
    else:
        contador_intentos += 1                #-->Si no está en personaje
        print(f"Incorrecto!")

if "_" not in personaje_oculto:
    print(f"Has ganado, él personaje es: {personaje}!")
else:
    print(f"Has perdido, él personaje era: {personaje}!")
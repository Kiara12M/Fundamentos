import random
import image
#import request

URLrickyMorty = "https://rickandmortyapi.com/api/character/"
personaje = random.randint(1,826)
contenidoWeb = request.get(f"{URLrickyMorty}{personaje}")
personaje = contenidoWeb.json()

objeto = personaje #??

nombre = objeto["name"]
tipo = objeto["type"]
especie = objeto["species"]
genero = objeto["gender"]
#foto = objeto["image"]

print(nombre)

print(f"Bienvenido al ahorcado de Ricky y Morty :)")
print(f"Usa estas pistas para adivinar el personaje: {tipo}, {especie} y {genero}")
print(f"Tienes x intento")
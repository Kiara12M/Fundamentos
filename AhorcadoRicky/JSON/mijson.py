import json

def CargarJSON(ruta):
    try:
        with open (ruta,"r") as fichero:
            return json.load(fichero)
    except FileNotFoundError:
        return {}
def guardarJSON(diccionario,ruta):
    with open(ruta, "w") as fichero:
        json.dump(diccionario, fichero, indent=4)
import json

#def cargarJSON(ruta):
#    try:
#        with open(ruta, "r") as fichero:
#            return json.load(fichero)
#    except FileNotFoundError:
#        return {}
#
#def guardarJSON(diccionario, ruta):
#    with open(ruta, "w") as fichero:
#        #Lo guarda en un diccionario, este fichero con indentación 4.
#        json.dump(diccionario,fichero,indent=4)

def cargarJSON(ruta):
    try:
        with open(ruta, "r") as fichero:
            return json.load(fichero)
    except FileNotFoundError:
        return {}

def guardarJSON(diccionario, ruta):
    with open(ruta, "w") as fichero:
        json.dump(diccionario, fichero, indent=4)


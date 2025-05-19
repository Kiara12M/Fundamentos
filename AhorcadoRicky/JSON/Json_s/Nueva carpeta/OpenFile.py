import os
def crearArchivo(nombre):
    if os.path.exists(nombre):
        print("Existe")
    else:
        archivo = open(nombre, "x")
        print("No existe")

def crearInformacion(info, archivo):
    gestorArchivos = open(archivo, "w")
    gestorArchivos.write(info)


def añadirInformacion(info, archivo):
    gestorArchivos = open(archivo, "a")
    gestorArchivos.write(info)

def leerFichero(archivo):
    lectorArchivo = open(archivo, "r")
    info = lectorArchivo.read()
    return info


#informacionArchivo = leerFichero("practicas.txt")
#infoXLineas = informacionArchivo.split("\n")
#for linea in infoXLineas:
#    print(linea)
#
#listaPracticasFundamentos = os.listdir("..")
#
#for practica in listaPracticasFundamentos:
#    añadirInformacion(practica + "\n", "practicas.txt")
#
#añadirInformacion(listaPracticasFundamentos, "practicas.txt")
#
#
#print(leerFichero("practicas.txt"))


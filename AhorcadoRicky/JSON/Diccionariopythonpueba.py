
from mijson import CargarJSON,guardarJSON #Cargar crea el JSON y Guardar mete los datos introducidos


menu=("1. agregar nombre\n 2. saber edad\n 3. salir")
print(menu)
respuesta=input("dime tu respuesta de las opciones ")
estudiantes=CargarJSON("estudiantes.json") #Crea el archivo Json y dentro del parentesis se pone el nombre de la lista

if respuesta=="1":
    nombreNuevo=input("introduce nombre\n")
    introduceEdad=int(input("introduce edad\n"))
    estudiantes [nombreNuevo]=int(introduceEdad)
    guardarJSON(estudiantes,"estudiantes.json") #para guardar los datos nuevos
    print(estudiantes)

elif respuesta=="2":
    consultaredad=input("introduce el nombre de quien quieras saber la edad \n")
    while consultaredad not in estudiantes:
        respuuesta2=input("este nombre no esta en la lista quieres agregarlo s/n")
        nombreNuevo = input("introduce nombre\n")
        introduceEdad = int(input("introduce edad\n"))
        if respuuesta2=="s":
            estudiantes[nombreNuevo]=int(introduceEdad)
            print(estudiantes)
            guardarJSON(estudiantes,"estudiantes.json") #Hay que poner guardar para que se añada a la lista

        else:
            print("Adios")
else:
    print("adios")


#nombre = {"sara":26, "Diana": 27, "Isma": 24, "Juan": 22}
#
#print(nombre) #para sacar todo el diccionario
#print(nombre["sara"]) #para sacar un valor especifico
#
#nombreNuevo = input("Introduce el nombre nuevo:")
#edadNueva = int(input("Introduce la edad nueva:"))
#
#nombre[nombreNuevo] = int(edadNueva) #para que los añada a la biblioteca
#
#print (nombre)


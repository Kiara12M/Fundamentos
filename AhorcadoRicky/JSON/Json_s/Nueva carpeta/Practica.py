from Practica1.JSON.OpenFile import crearArchivo, añadirInformacion,leerFichero
def crearUsuario():
    nombre =input("Nombre: ")
    telefono = input("Teléfono: ")
    email = input("Email: ")
    return f"Nombre: {nombre}; Teléfono: {telefono}; Email: {email}\n"

crearArchivo("user.csv")
continuar = input("¿Desea seguir añadiendo datos s/n? ")
opcionValida = ["s","n"]

while continuar not in opcionValida:
    continuar = input("Opción no válida, ¿desea seguir s/n?")
while continuar.lower() == "s":
    añadirInformacion(crearUsuario(), "user.csv")
    informacionArchivo = leerFichero("user.csv")
    print(informacionArchivo)
    continuar = input("¿Desea seguir añadiendo datos s/n? ")

print("Ok, bye")



def buscarContacto(nombre, archivo):
    #Obtengo el fichero para su posterior lectura.
    informacionArchivo = leerFichero(archivo)
    #Leo el archivo línea poir línea.
    lineas = informacionArchivo.split("\n")

    for linea in lineas:
        if linea.startswith(f"Nombre: {nombre}"):
            return linea

    return "Contacto no encontrado."

nombre_buscar = input("\nIngrese el nombre del contacto a buscar: ")
resultado = buscarContacto(nombre_buscar, "user.csv")
print("\nResultado de la búsqueda:")
print(resultado)


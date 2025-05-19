
from mijson import CargarJSON, guardarJSON

menu = ("1. Añadir alumno \n"
        "2. Consultar la edad\n"
        "3. Salir")

print(menu)

introduce = int(input("Introduce un numero: "))
alumnos = CargarJSON("alumnos.json")

if introduce == 1:
    nombre = input("Introduce el nombre del alumno: ")
    edad = int(input("Introduce la edad del alumno: "))
    alumnos[nombre] = int(edad)
    guardarJSON(alumnos,"alumnos.json")
    print(alumnos)
    introduce = input("Deseas añadir algun alumno más?(s/n): ")
    if introduce == "s" or introduce == "S":
        nombre = input("Introduce el nombre del alumno: ")
        edad = int(input("Introduce la edad del alumno: "))
        alumnos[nombre] = int(edad)
        guardarJSON(alumnos, "alumnos.json")
        print(alumnos)
    else:
        print("Hasta pronto!")


elif introduce == 2:
    consultar_nombre = input("Introduce el nombre del alumno del que quieras saber la edad: ")
    if consultar_nombre not in alumnos:
        print("Error! Nombre no encontrado.")
        introducir = input("Deseas añadirlo a la lista?(S/N):")
        if introducir == "S" or introducir == "s":
            nombre = input("Introduce el nombre del alumno: ")
            edad = int(input("Introduce la edad del alumno: "))
            alumnos[nombre] = int(edad)
            guardarJSON(alumnos, "alumnos.json")
        else:
            print("Hasta pronto!")

    else:
        print(f"Él alumno/a {consultar_nombre} tiene {alumnos[consultar_nombre]} años")

elif introduce == 3:
    print("Hasta pronto!")




from cargaGuardaJSON import cargarJSON, guardarJSON
#frutas = {
#    "plátano": 1.5,
#    "manzana": 2.2,
#    "melocotón":1.8
#}
#print(frutas)
##AGREGAR ELEMENTO AL DICCIONARIO
#frutas["papaya"] = 2.65
#print(frutas)
#frutas = cargarJSON("frutas.json")
#clave = input("Dime fruta:")
#valor = float(input("Dime su precio:"))
#frutas[clave] = valor
#
#guardarJSON(frutas,"frutas.json")

frutas = cargarJSON("fruta.json")
print("Fichero creado correctamente")

respuesta = input("Añadir nueva fruta s/n: ")
while respuesta.lower() == "s":
    clave = input("Fruta: ")
    valor = float(input("Precio: "))
    frutas[clave] = valor
    consultar = input("Desea consultar precio s/n: ")
    while consultar == "s":
        cantidad = float(input("Cuantos kg necesitas: "))
        if consultar == "s":
            elemento = input("Elemento a consultar: ")
            while elemento not in frutas:
                print(f"Lo siento, el/la {elemento} no se encuentra disponible")
                elemento = input("Elemento a consultar: ")
            if elemento in frutas:
                print(f"El/la {elemento}, cuyo precio es: {frutas[elemento]*cantidad}€")
        else:
            print("De acuerdo,vuelva pronto")
        consultar = input("Desea consultar precio s/n: ")
    respuesta = input("Añadir nueva fruta s/n: ")
guardarJSON(frutas,"fruta.json")
print("Gracias, adiós")


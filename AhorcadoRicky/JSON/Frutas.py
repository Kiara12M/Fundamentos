
#Para hacer una lista

lista_frutas = {"Pera":2.50,"Lima":1, "Sandia":4.60, "Fresa":2.50}

fruta_nueva = input("Introduce el nombre de la fruta:")
precio_f = int(input("Introduzca el precio de la fruta: "))

lista_frutas[fruta_nueva] = int(precio_f) #Primero va el nombre de la lista, despues la fruta nueva en corchetes y despues ponemos el tipo y dentro de parentesis el precio de la fruta

print(lista_frutas)




from Practica1.JSON.cargaGuardaJSON import cargarJSON,guardarJSON

pokedex = cargarJSON("pokemon.json")
print("Cargando archivo...")
try :
    pokemons = pokedex["pokemons"]
except KeyError:
    pokedex["pokemons"] = []
    pokemons = pokedex["pokemons"]
cargarPokemon = input("Añadir pokemon s/n: ")
while cargarPokemon == "s":
    nuevo_pokemon = {"numPokedex" : int(input("Número en la pokedex: \n")),
                    "nombrePokemon" : input("Nombre Pokemon: \n"),
                     "tipoPokemon" : [input(f"Dime el tipo: \n")],
                     "Damage": float(input("Daño: \n")),
                     "Stats": {"vida": int(input("Vida: \n")),
                               "velocidad": int(input("Velocidad: \n")),
                               "ataque": int(input("Ataque: \n")),
                               "ataqueEspecial": int(input("AtaqueEspecial: \n")),
                               "defensa": int(input("Defensa: \n")),
                               "defensaEspecial": int(input("Defensa Especial: \n"))
                               },
                     "ataques": [{"nombreAtaque": input("Nombre del ataque: \n"),
                                  "tipoAtaque": input("Tipo del ataque: \n"),
                                  "damageAtaque": int(input("Daño del ataque: \n")),
                                  "esFisico": input("Es físico s/n: \n"),
                                  "usos": int(input("Cantidad de pp: \n"))}]
                     }
    #pokemon["Stats"]["vida"] = int(input("vida"))
    pokemons.append(nuevo_pokemon)
    cargarPokemon = input("Añadir pokemon s/n: ")

pokedex["pokemons"] = pokemons
guardarJSON(pokedex, "pokemon.json")
print("Bye")





#pokedex["chubasco"] = "Chaparrón"
#print(pokedex)
#pokedex.pop("chubasco")
#pokedex.popitem() #Elimina la última clave introducida
#print(pokedex.keys())
#print(pokedex.values())
##nuevaRae = rae
##nuevaRaeReal = rae.copy()
##nuevaRaeReal["desguabinado"] = "hhhh"
#
##Imprimirá cada palabra de mi pokedex// clave:valor.
#for palabra in pokedex:
#    print(palabra)
#    print(pokedex[palabra])
##Imprimirá cada clave, y cada valor de nuestra pokedex.
#for k,v in pokedex.items():
#    print(f"{k}:{v}")
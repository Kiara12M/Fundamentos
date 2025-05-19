from Practica1.JSON.cargaGuardaJSON import cargarJSON,guardarJSON

def guardarInformacionBasica(jugador):
    infoBasica = ["nombre","mote","equipo","sueldo","numero"]
    for info in infoBasica:
        jugador[info] = input(f"Dime su {info}: ")

def guardarEstadisticas(jugador):
    estadisticas = {}
    stats = ["goles","partidos","asistencias"]
    for stat in stats:
        estadisticas[stat] = int(input(f"Dime su {stat}: "))
    jugador["estadisticas"] = estadisticas

def guardarPosiciones(jugador):
    numPosiciones = int(input("¿En cuántas posiciones puede jugar?"))
    posiciones = []
    for i in range(numPosiciones):
        posiciones.append(input(f"Posición {i+1}: "))
    jugador["posiciones"] = posiciones

def guardarHistorico(jugador):
    historico = []
    numEquipos = int(input("¿En cuántos equipos ha jugado?"))
    for i in range(numEquipos):
        equipo = {}
        equipo["equipoHistorico"] = input(f"Equipo {i+1}: ")
        equipo["temporadas"]  = [
            int(input("Inicio: ")),
            int(input("Final: "))
        ]
        historico.append(equipo)
    jugador["historico"] = historico

diccionarioJugadores = cargarJSON("jugadores.json")

try:
    jugadores = diccionarioJugadores["jugadores"]
except KeyError:
    diccionarioJugadores["jugadores"] = []
    jugadores = diccionarioJugadores["jugadores"]

continuar = True
while continuar:
    jugador = {}
    guardarInformacionBasica(jugador)
    guardarEstadisticas(jugador)
    guardarPosiciones(jugador)
    guardarHistorico(jugador)
    jugadores.append(jugador)
    if input("¿Otro jugador?(s/n): ") != "s":
        continuar = False

diccionarioJugadores["jugadores"] = jugadores
guardarJSON(diccionarioJugadores, "jugadores.json")

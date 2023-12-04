cantidadEstudiantes = int(input("Ingrese la cantidad de estudiantes:"))
mejorEgresado = ""
mejorPromedio = 0

for i in range(1, cantidadEstudiantes + 1):
    nombre = input("Ingrese el nombre del estudiante " + str(i) + ":")

    promedio = float(input("Ingrese el promedio final del estudiante " + str(i) + ":"))
    if promedio > mejorPromedio:
        mejorEgresado = nombre
        mejorPromedio = promedio
    elif promedio == mejorPromedio:
        mejorEgresado += " y " + nombre

print("El mejor Egresado es: " + mejorEgresado + " con un promedio de " + str(mejorPromedio))
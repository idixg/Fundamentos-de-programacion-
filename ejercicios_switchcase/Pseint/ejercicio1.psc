Algoritmo ejercicio1
	Definir mes Como Entero
    Escribir "Ingrese el numero del mes (1-12):"
    Leer mes
    
    Segun mes Hacer
        1, 3, 5, 7, 8, 10, 12:
            Escribir "El mes tiene 31 dias."
        4, 6, 9, 11:
            Escribir "El mes tiene 30 dias."
        2:
            Escribir "El mes tiene 28 dias."
        De Otro Modo:
            Escribir "Error: El numero debe estar entre 1 y 12."
    FinSegun
    
    Segun mes Hacer
        1: Escribir "Nombre: Enero"
        2: Escribir "Nombre: Febrero"
        3: Escribir "Nombre: Marzo"
        4: Escribir "Nombre: Abril"
        5: Escribir "Nombre: Mayo"
        6: Escribir "Nombre: Junio"
        7: Escribir "Nombre: Julio"
        8: Escribir "Nombre: Agosto"
        9: Escribir "Nombre: Septiembre"
        10: Escribir "Nombre: Octubre"
        11: Escribir "Nombre: Noviembre"
        12: Escribir "Nombre: Diciembre"
    FinSegun
	
FinAlgoritmo

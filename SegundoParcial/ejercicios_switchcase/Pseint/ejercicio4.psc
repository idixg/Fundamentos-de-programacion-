Algoritmo e4
	Definir h Como Entero
    Escribir "Ingrese la hora (0 a 23):"
    Leer h
    
    Segun h Hacer
        6, 7, 8, 9, 10, 11, 12:
            Escribir "Buenos dias"
        13, 14, 15, 16, 17, 18, 19, 20:
            Escribir "Buenas tardes"
        21, 22, 23, 0, 1, 2, 3, 4, 5:
            Escribir "Buenas noches"
        De Otro Modo:
            Escribir "Hora fuera de rango valido (0-23)."
    FinSegun
FinAlgoritmo

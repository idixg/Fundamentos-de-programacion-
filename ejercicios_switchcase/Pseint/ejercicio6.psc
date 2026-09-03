Algoritmo e6
	Definir personas, diaSemana, parejas, individuales Como Enteros
    Definir tieneMembresia Como Caracter
    Definir total Como Real
    
    Escribir "Ingrese cantidad de personas:"
    Leer personas
    Escribir "Seleccione dia de la semana (1:Lunes, 2:Martes, 3:Miercoles, 4:Jueves, 5:Viernes, 6:Sabado, 7:Domingo):"
    Leer diaSemana
    Escribir "Cuenta con membresia? (S/N):"
    Leer tieneMembresia
    
    Segun diaSemana Hacer
        3:
            total <- personas * 30
        4:
            parejas <- trunc(personas / 2)
            individuales <- personas % 2
            total <- (parejas * 75) + (individuales * 50)
        1, 2, 5, 6, 7:
            total <- personas * 50
        De Otro Modo:
            Escribir "Dia no valido."
    FinSegun
    
    Si Mayusculas(tieneMembresia) = "S" Entonces
        total <- total * 0.90
    FinSi
    
    Escribir "El precio total es: $", total
FinAlgoritmo

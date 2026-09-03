Algoritmo e7
	Definir opcionSabor, opcionChoc, cantidadSnacks, respuestaNombre Como Enteros
    Definir total Como Real
    
    total <- 0
    Escribir "Elija el sabor de la tarta (1: Manzana, 2: Fresa, 3: Chocolate):"
    Leer opcionSabor
    
    Segun opcionSabor Hacer
        1:
            total <- total + 200
        2:
            total <- total + 250
        3:
            Escribir "Tipo de chocolate (1: Negro, 2: Blanco):"
            Leer opcionChoc
            Segun opcionChoc Hacer
                1: total <- total + 280
                2: total <- total + 300
                De Otro Modo: Escribir "Opcion de chocolate no valida."
            FinSegun
        De Otro Modo:
            Escribir "Sabor no valido."
    FinSegun
    
    Escribir "Cuantos snacks desea añadir? ($25 c/u):"
    Leer cantidadSnacks
    total <- total + (cantidadSnacks * 25)
    
    Escribir "Desea personalizar con un nombre? (1: Si, 2: No):"
    Leer respuestaNombre
    Si respuestaNombre = 1 Entonces
        total <- total + 30
    FinSi
    
    Escribir "El presupuesto total de la tarta es: $", total
FinAlgoritmo

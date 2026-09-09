Algoritmo pasteles
	Definir total Como Real
    Definir opcionSabor, opcionChoc, opcionSnack Como Entero
    Definir respuestaSnack, respuestaNombre Como Caracter
	
    total <- 0
	
    Escribir "----- PASTELERIA -----"
    Escribir "Elija el sabor de la tarta:"
    Escribir "1. Manzana - $200"
    Escribir "2. Fresa - $250"
    Escribir "3. Chocolate"
    Leer opcionSabor
	
    Segun opcionSabor Hacer
        1:
            total <- total + 200
			
        2:
            total <- total + 250
			
        3:
            Escribir "Tipo de chocolate:"
            Escribir "1. Negro - $280"
            Escribir "2. Blanco - $300"
            Leer opcionChoc
			
            Segun opcionChoc Hacer
                1:
                    total <- total + 280
                2:
                    total <- total + 300
                De Otro Modo:
                    Escribir "Opcion de chocolate no valida."
            FinSegun
			
        De Otro Modo:
            Escribir "Sabor no valido."
    FinSegun
	
    Escribir "¿Desea añadir un snack? (S/N)"
    Leer respuestaSnack
	
    Mientras respuestaSnack = "S" O respuestaSnack = "s" Hacer
		
        Escribir "Elija el snack:"
        Escribir "1. Fresa"
        Escribir "2. Galleta"
        Escribir "3. Durazno"
        Leer opcionSnack
		
        Segun opcionSnack Hacer
            1:
                Escribir "Se agrego fresa."
                total <- total + 25
				
            2:
                Escribir "Se agrego galleta."
                total <- total + 25
				
            3:
                Escribir "Se agrego durazno."
                total <- total + 25
				
            De Otro Modo:
                Escribir "Snack no valido."
        FinSegun
		
        Escribir "¿Desea añadir otro snack? (S/N)"
        Leer respuestaSnack
		
    FinMientras
	
    Escribir "¿Desea personalizar con un nombre? (S/N)"
    Leer respuestaNombre
	
    Si respuestaNombre = "S" O respuestaNombre = "s" Entonces
        total <- total + 30
    FinSi
	
    Escribir "El presupuesto total de la tarta es: $", total
FinAlgoritmo

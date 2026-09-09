Algoritmo figuras3
	Definir n, i, j Como Entero
	
    Escribir "Ingresa el numero de lineas:"
    Leer n
	
    // FIGURA 1
    Escribir ""
    Escribir "FIGURA 1:"
	
    Para i <- 1 Hasta n Hacer
        Para j <- 1 Hasta n Hacer
            Escribir Sin Saltar "*"
        FinPara
        Escribir ""
    FinPara
	
    // FIGURA 2
    Escribir ""
    Escribir "FIGURA 2:"
	
    Para i <- n Hasta 1 Con Paso -1 Hacer
        Para j <- 1 Hasta (2 * i - 1) Hacer
            Escribir Sin Saltar "*"
        FinPara
        Escribir ""
    FinPara
	
    // FIGURA 3
    Escribir ""
    Escribir "FIGURA 3:"
	
    Para i <- 1 Hasta n Hacer
        Para j <- 1 Hasta (2 * i - 1) Hacer
            Escribir Sin Saltar "*"
        FinPara
        Escribir ""
    FinPara

FinAlgoritmo

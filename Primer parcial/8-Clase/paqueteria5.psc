Algoritmo paqueteria
	Definir zona Como Entero
    Definir pesoGramos, costoGramo, totalPagar Como Real
    
    Escribir "Ingrese el peso del paquete en gramos:"
    Leer pesoGramos
    
    Si pesoGramos > 5000 Entonces
        Escribir "El paquete excede los 5 kg. Entrega rechazada por logística."
    Sino
        Escribir "Ingrese la zona (1: N.América, 2: C.América, 3: S.América, 4: Europa, 5: Asia):"
        Leer zona
        
        Si zona = 1 Entonces
            costoGramo <- 11
        Sino 
            Si zona = 2 Entonces
                costoGramo <- 10
            Sino 
                Si zona = 3 Entonces
                    costoGramo <- 12
                Sino 
                    Si zona = 4 Entonces
                        costoGramo <- 25
                    Sino 
                        Si zona = 5 Entonces
                            costoGramo <- 30
                        FinSi
                    FinSi
                FinSi
            FinSi
        FinSi
        
        totalPagar <- pesoGramos * costoGramo
        Escribir "El costo por el envío es: $", totalPagar
    FinSi
	
	
FinAlgoritmo

Algoritmo ConsumoElectrico
	
    Definir lecturaAnterior, lecturaActual Como Real
    Definir consumo, costoConsumo Como Real
    Definir cargoFijo, costoAntesImpuesto Como Real
    Definir descuento, impuesto, total Como Real
    Definir apoyo Como Entero
	
    // Lectura anterior
    Repetir
        Escribir "Ingresa la lectura anterior:"
        Leer lecturaAnterior
		
        Si lecturaAnterior < 0 Entonces
            Escribir "Error: la lectura no puede ser negativa."
        FinSi
    Hasta Que lecturaAnterior >= 0
	
	
    // Lectura actual
    Repetir
        Escribir "Ingresa la lectura actual:"
        Leer lecturaActual
		
        Si lecturaActual < lecturaAnterior Entonces
            Escribir "Error: la lectura actual debe ser mayor o igual a la lectura anterior."
        FinSi
    Hasta Que lecturaActual >= lecturaAnterior
	
	
    // Calcular consumo
    consumo <- lecturaActual - lecturaAnterior
	
	
    // Validar consumo maximo
    Si consumo > 10000 Entonces
        Escribir "Error: el consumo maximo permitido es de 10,000 kWh."
    SiNo
		
        // Calcular costo por bloques
        Si consumo <= 150 Entonces
            costoConsumo <- consumo * 1.20
        SiNo
            Si consumo <= 400 Entonces
                costoConsumo <- (150 * 1.20) + ((consumo - 150) * 1.80)
            SiNo
                costoConsumo <- (150 * 1.20) + (250 * 1.80) + ((consumo - 400) * 2.75)
            FinSi
        FinSi
		
		
        // Cargo fijo
        cargoFijo <- 95
		
		
        // Costo antes del impuesto
        costoAntesImpuesto <- costoConsumo + cargoFijo
		
		
        // Preguntar si pertenece al programa de apoyo
        Repetir
            Escribir ""
            Escribir "La vivienda pertenece al programa de apoyo?"
            Escribir "1. Si"
            Escribir "2. No"
            Leer apoyo
			
            Si apoyo <> 1 Y apoyo <> 2 Entonces
                Escribir "Error: selecciona 1 o 2."
            FinSi
        Hasta Que apoyo = 1 O apoyo = 2
		
		
        // Calcular descuento
        Si apoyo = 1 Y consumo <= 250 Entonces
            descuento <- costoAntesImpuesto * 0.30
        SiNo
            descuento <- 0
        FinSi
		
		
        // Calcular impuesto
        impuesto <- (costoAntesImpuesto - descuento) * 0.16
		
		
        // Calcular total
        total <- costoAntesImpuesto - descuento + impuesto
		
		
        // Mostrar recibo
        Escribir ""
        Escribir "======================================"
        Escribir "       RECIBO DE CONSUMO ELECTRICO"
        Escribir "======================================"
        Escribir "Lectura anterior: ", lecturaAnterior
        Escribir "Lectura actual: ", lecturaActual
        Escribir "Consumo: ", consumo, " kWh"
        Escribir "Costo del consumo: $", costoConsumo
        Escribir "Cargo fijo: $", cargoFijo
        Escribir "Costo antes del impuesto: $", costoAntesImpuesto
        Escribir "Descuento por apoyo: $", descuento
        Escribir "Impuesto: $", impuesto
        Escribir "TOTAL A PAGAR: $", total
        Escribir "======================================"
		
    FinSi
	
FinAlgoritmo
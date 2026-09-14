Algoritmo SeguroAutomovil
	
    Definir valorVehiculo, tarifaBase, recargoEdad, recargoAccidentes Como Real
    Definir subtotal, descuento, costoFinal Como Real
    Definir edad, accidentes, seguridad Como Entero
	
    Repetir
        Escribir "Ingresa el valor del automovil:"
        Leer valorVehiculo
		
        Si valorVehiculo <= 0 Entonces
            Escribir "Error: el valor debe ser mayor que cero."
        FinSi
    Hasta Que valorVehiculo > 0
	
	
    Repetir
        Escribir "Ingresa la edad del conductor:"
        Leer edad
		
        Si edad < 18 O edad > 100 Entonces
            Escribir "Error: la edad debe estar entre 18 y 100 anos."
        FinSi
    Hasta Que edad >= 18 Y edad <= 100
	
	
    Repetir
        Escribir "Ingresa la cantidad de accidentes:"
        Leer accidentes
		
        Si accidentes < 0 Entonces
            Escribir "Error: los accidentes no pueden ser negativos."
        FinSi
    Hasta Que accidentes >= 0
	
	
    Repetir
        Escribir "Cuenta con sistema de seguridad adicional?"
        Escribir "1. Si"
        Escribir "2. No"
        Leer seguridad
		
        Si seguridad <> 1 Y seguridad <> 2 Entonces
            Escribir "Error: selecciona 1 o 2."
        FinSi
    Hasta Que seguridad = 1 O seguridad = 2
	
	
    // Calcular tarifa base
    tarifaBase <- valorVehiculo * 0.04
	
	
    // Calcular recargo por edad
    Si edad < 25 Entonces
        recargoEdad <- tarifaBase * 0.20
    SiNo
        Si edad > 60 Entonces
            recargoEdad <- tarifaBase * 0.10
        SiNo
            recargoEdad <- 0
        FinSi
    FinSi
	
	
    // Calcular recargo por accidentes
    recargoAccidentes <- tarifaBase * 0.08 * accidentes
	
	
    // Calcular subtotal
    subtotal <- tarifaBase + recargoEdad + recargoAccidentes
	
	
    // Calcular descuento por seguridad
    Si seguridad = 1 Entonces
        descuento <- subtotal * 0.05
    SiNo
        descuento <- 0
    FinSi
	
	
    // Calcular costo final
    costoFinal <- subtotal - descuento
	
	
    // Mostrar resultados
    Escribir ""
    Escribir "---------- COTIZACION DEL SEGURO ----------"
    Escribir "Tarifa base: $", tarifaBase
    Escribir "Recargo por edad: $", recargoEdad
    Escribir "Recargo por accidentes: $", recargoAccidentes
    Escribir "Subtotal: $", subtotal
    Escribir "Descuento por seguridad: $", descuento
    Escribir "Costo anual final: $", costoFinal
    Escribir "--------------------------------------------"
	
FinAlgoritmo
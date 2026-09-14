Algoritmo TiendaEnLinea
	
    Definir precio1, precio2, precio3 Como Real
    Definir subtotal1, subtotal2, subtotal3 Como Real
    Definir subtotal, descuento, subtotalConDescuento Como Real
    Definir envio, impuesto, total Como Real
    Definir cantidad1, cantidad2, cantidad3 Como Entero
    Definir tipoCliente Como Entero
    Definir codigoPostal Como Caracter
	
    // Precio del producto 1
    Repetir
        Escribir "Ingresa el precio del producto 1:"
        Leer precio1
		
        Si precio1 <= 0 Entonces
            Escribir "Error: el precio debe ser mayor que cero."
        FinSi
    Hasta Que precio1 > 0
	
    // Cantidad del producto 1
    Repetir
        Escribir "Ingresa la cantidad del producto 1:"
        Leer cantidad1
		
        Si cantidad1 <= 0 Entonces
            Escribir "Error: la cantidad debe ser mayor que cero."
        FinSi
    Hasta Que cantidad1 > 0
	
	
    // Precio del producto 2
    Repetir
        Escribir "Ingresa el precio del producto 2:"
        Leer precio2
		
        Si precio2 <= 0 Entonces
            Escribir "Error: el precio debe ser mayor que cero."
        FinSi
    Hasta Que precio2 > 0
	
    // Cantidad del producto 2
    Repetir
        Escribir "Ingresa la cantidad del producto 2:"
        Leer cantidad2
		
        Si cantidad2 <= 0 Entonces
            Escribir "Error: la cantidad debe ser mayor que cero."
        FinSi
    Hasta Que cantidad2 > 0
	
	
    // Precio del producto 3
    Repetir
        Escribir "Ingresa el precio del producto 3:"
        Leer precio3
		
        Si precio3 <= 0 Entonces
            Escribir "Error: el precio debe ser mayor que cero."
        FinSi
    Hasta Que precio3 > 0
	
    // Cantidad del producto 3
    Repetir
        Escribir "Ingresa la cantidad del producto 3:"
        Leer cantidad3
		
        Si cantidad3 <= 0 Entonces
            Escribir "Error: la cantidad debe ser mayor que cero."
        FinSi
    Hasta Que cantidad3 > 0
	
	
    // Calcular subtotal de cada producto
    subtotal1 <- precio1 * cantidad1
    subtotal2 <- precio2 * cantidad2
    subtotal3 <- precio3 * cantidad3
	
    // Calcular subtotal general
    subtotal <- subtotal1 + subtotal2 + subtotal3
	
	
    // Tipo de cliente
    Repetir
        Escribir ""
        Escribir "Tipo de cliente:"
        Escribir "1. Cliente regular"
        Escribir "2. Cliente frecuente"
        Leer tipoCliente
		
        Si tipoCliente <> 1 Y tipoCliente <> 2 Entonces
            Escribir "Error: selecciona 1 o 2."
        FinSi
    Hasta Que tipoCliente = 1 O tipoCliente = 2
	
	
    // Calcular descuento
    Si tipoCliente = 1 Entonces
        descuento <- 0
    SiNo
        descuento <- subtotal * 0.10
    FinSi
	
	
    // Calcular subtotal despues del descuento
    subtotalConDescuento <- subtotal - descuento
	
	
    // Codigo postal
    Repetir
        Escribir ""
        Escribir "Ingresa el codigo postal de 5 digitos:"
        Leer codigoPostal
		
        Si Longitud(codigoPostal) <> 5 Entonces
            Escribir "Error: el codigo postal debe contener exactamente 5 digitos."
        FinSi
    Hasta Que Longitud(codigoPostal) = 5
	
	
    // Calcular envio
    Si subtotal < 1000 Entonces
        envio <- 150
    SiNo
        Si subtotal < 3000 Entonces
            envio <- 80
        SiNo
            envio <- 0
        FinSi
    FinSi
	
	
    // Calcular impuesto
    impuesto <- subtotalConDescuento * 0.16
	
	
    // Calcular total
    total <- subtotal - descuento + impuesto + envio
	
	
    // Mostrar resultados
    Escribir ""
    Escribir "======================================"
    Escribir "       TICKET DE COMPRA"
    Escribir "======================================"
    Escribir "Subtotal producto 1: $", subtotal1
    Escribir "Subtotal producto 2: $", subtotal2
    Escribir "Subtotal producto 3: $", subtotal3
    Escribir "Subtotal general: $", subtotal
    Escribir "Descuento: $", descuento
    Escribir "Subtotal con descuento: $", subtotalConDescuento
    Escribir "Costo de envio: $", envio
    Escribir "Impuesto: $", impuesto
    Escribir "TOTAL A PAGAR: $", total
    Escribir "Codigo postal: ", codigoPostal
    Escribir "======================================"
	
FinAlgoritmo

Algoritmo e2
	Definir n1, n2 Como Enteros
    Definir op Como Caracter
    
    Escribir "Ingrese el primer numero entero:"
    Leer n1
    Escribir "Ingrese el segundo numero entero:"
    Leer n2
    Escribir "Ingrese la operacion (+, -, *, /):"
    Leer op
    
    Segun op Hacer
        "+":
            Escribir "Resultado: ", (n1 + n2)
        "-":
            Escribir "Resultado: ", (n1 - n2)
        "*":
            Escribir "Resultado: ", (n1 * n2)
        "/":
            Si n2 <> 0 Entonces
                Escribir "Resultado: ", (n1 / n2)
            Sino
                Escribir "Error: Division por cero."
            FinSi
        De Otro Modo:
            Escribir "Operador no valido."
    FinSegun
	
FinAlgoritmo

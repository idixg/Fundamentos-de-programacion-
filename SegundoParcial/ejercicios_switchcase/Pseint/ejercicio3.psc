Algoritmo e3
	Definir opcion Como Entero
    Definir l, b, h, r, area Como Real
    
    Escribir "MENU DE AREAS"
    Escribir "1. Cuadrado"
    Escribir "2. Rectangulo"
    Escribir "3. Triangulo"
    Escribir "4. Circulo"
    Escribir "Seleccione una opcion:"
    Leer opcion
    
    Segun opcion Hacer
        1:
            Escribir "Ingrese el lado:"
            Leer l
            Escribir "Area: ", (l * l)
        2:
            Escribir "Ingrese la base:"
            Leer b
            Escribir "Ingrese la altura:"
            Leer h
            Escribir "Area: ", (b * h)
        3:
            Escribir "Ingrese la base:"
            Leer b
            Escribir "Ingrese la altura:"
            Leer h
            Escribir "Area: ", (b * h / 2)
        4:
            Escribir "Ingrese el radio:"
            Leer r
            Escribir "Area: ", (PI * r * r)
        De Otro Modo:
            Escribir "Opcion invalida."
    FinSegun
FinAlgoritmo

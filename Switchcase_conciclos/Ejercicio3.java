import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion;
        double resultado;
        char continuar;

        do {
            System.out.println("\n----- MENU DE AREAS -----");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Introduce el lado: ");
                    double lado = teclado.nextDouble();

                    resultado = lado * lado;

                    System.out.println("Área del cuadrado: " + resultado);
                    break;

                case 2:
                    System.out.print("Introduce la base: ");
                    double baseR = teclado.nextDouble();

                    System.out.print("Introduce la altura: ");
                    double alturaR = teclado.nextDouble();

                    resultado = baseR * alturaR;

                    System.out.println("Área del rectángulo: " + resultado);
                    break;

                case 3:
                    System.out.print("Introduce la base: ");
                    double baseT = teclado.nextDouble();

                    System.out.print("Introduce la altura: ");
                    double alturaT = teclado.nextDouble();

                    resultado = (baseT * alturaT) / 2;

                    System.out.println("Área del triángulo: " + resultado);
                    break;

                case 4:
                    System.out.print("Introduce el radio: ");
                    double radio = teclado.nextDouble();

                    resultado = Math.PI * radio * radio;

                    System.out.println("Área del círculo: " + resultado);
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            System.out.print("\n¿Quieres volver a realizar el ejercicio? (S/N): ");
            continuar = teclado.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Programa terminado.");
    }
}
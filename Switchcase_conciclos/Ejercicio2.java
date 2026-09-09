import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        char operador, continuar;
        double resultado;

        do {
            System.out.print("Introduce el primer número: ");
            num1 = teclado.nextInt();

            System.out.print("Introduce el segundo número: ");
            num2 = teclado.nextInt();

            do {
                System.out.print("Introduce la operación (+, -, *, /): ");
                operador = teclado.next().charAt(0);

                if (operador != '+' && operador != '-' &&
                    operador != '*' && operador != '/') {
                    System.out.println("Error: operador no válido.");
                }

            } while (operador != '+' && operador != '-' &&
                     operador != '*' && operador != '/');

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '-':
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '*':
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: división por cero.");
                    } else {
                        resultado = (double) num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    }
                    break;
            }

            System.out.print("\n¿Quieres volver a realizar el ejercicio? (S/N): ");
            continuar = teclado.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Programa terminado.");
    }
}
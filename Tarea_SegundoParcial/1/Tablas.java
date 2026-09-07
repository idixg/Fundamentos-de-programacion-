import java.util.Scanner;

public class Tablas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int i;

        System.out.print("Ingresa un número (0 para terminar): ");
        n = entrada.nextInt();

        while (n != 0) {

            for (i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }

            System.out.println();

            System.out.print("Ingresa otro número (0 para terminar): ");
            n = entrada.nextInt();
        }

        System.out.println("Programa terminado.");

        entrada.close();
    }
}
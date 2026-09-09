import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int hora;
        char continuar;

        do {
            do {
                System.out.print("Introduce la hora (0-23): ");
                hora = teclado.nextInt();

                if (hora < 0 || hora > 23) {
                    System.out.println("Error: introduce una hora válida.");
                }

            } while (hora < 0 || hora > 23);

            if (hora >= 6 && hora <= 12) {
                System.out.println("Buenos días");
            } else if (hora >= 13 && hora <= 20) {
                System.out.println("Buenas tardes");
            } else {
                System.out.println("Buenas noches");
            }

            System.out.print("\n¿Quieres volver a realizar el ejercicio? (S/N): ");
            continuar = teclado.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Programa terminado.");
    }
}
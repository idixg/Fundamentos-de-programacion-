import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int personas, dia;
        double total;
        char membresia, continuar;

        do {
            System.out.print("Número de personas: ");
            personas = teclado.nextInt();

            System.out.println("\n----- DÍAS DE LA SEMANA -----");
            System.out.println("1. Lunes");
            System.out.println("2. Martes");
            System.out.println("3. Miércoles");
            System.out.println("4. Jueves");
            System.out.println("5. Viernes");
            System.out.println("6. Sábado");
            System.out.println("7. Domingo");

            System.out.print("Elige el día: ");
            dia = teclado.nextInt();

            System.out.print("¿Tienes membresía? (S/N): ");
            membresia = teclado.next().charAt(0);

            if (dia == 3) {
                // Miércoles
                total = personas * 30;

            } else if (dia == 4) {
                // Jueves
                total = (personas / 2) * 75 + (personas % 2) * 50;

            } else {
                // Precio normal
                total = personas * 50;
            }

            if (membresia == 'S' || membresia == 's') {
                total = total * 0.90;
            }

            System.out.println("Precio total: $" + total);

            System.out.print("\n¿Quieres volver a realizar el ejercicio? (S/N): ");
            continuar = teclado.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Programa terminado.");
    }
}
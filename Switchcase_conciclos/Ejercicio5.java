import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia, mes;
        char continuar;

        do {
            System.out.print("Introduce el día de nacimiento: ");
            dia = teclado.nextInt();

            System.out.print("Introduce el mes de nacimiento: ");
            mes = teclado.nextInt();

            if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
                System.out.println("Fecha no válida.");
            } else {

                if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                    System.out.println("Tu signo es Aries");

                } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
                    System.out.println("Tu signo es Tauro");

                } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                    System.out.println("Tu signo es Géminis");

                } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                    System.out.println("Tu signo es Cáncer");

                } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                    System.out.println("Tu signo es Leo");

                } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                    System.out.println("Tu signo es Virgo");

                } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                    System.out.println("Tu signo es Libra");

                } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                    System.out.println("Tu signo es Escorpio");

                } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                    System.out.println("Tu signo es Sagitario");

                } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
                    System.out.println("Tu signo es Capricornio");

                } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
                    System.out.println("Tu signo es Acuario");

                } else {
                    System.out.println("Tu signo es Piscis");
                }
            }

            System.out.print("\n¿Quieres volver a realizar el ejercicio? (S/N): ");
            continuar = teclado.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Programa terminado.");
    }
}
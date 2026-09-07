import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de personas: ");
        int personas = sc.nextInt();
        System.out.print("Seleccione dia de la semana (1:Lunes, 2:Martes, 3:Miercoles, 4:Jueves, 5:Viernes, 6:Sabado, 7:Domingo): ");
        int diaSemana = sc.nextInt();
        System.out.print("Cuenta con membresia? (S/N): ");
        char membresia = sc.next().toUpperCase().charAt(0);

        double total = 0;

        switch (diaSemana) {
            case 3:
                total = personas * 30;
                break;
            case 4:
                int parejas = personas / 2;
                int individuales = personas % 2;
                total = (parejas * 75) + (individuales * 50);
                break;
            case 1: case 2: case 5: case 6: case 7:
                total = personas * 50;
                break;
            default:
                System.out.println("Dia no valido.");
                return;
        }

        if (membresia == 'S') {
            total *= 0.90;
        }

        System.out.println("El precio total es: $" + total);
    }
}
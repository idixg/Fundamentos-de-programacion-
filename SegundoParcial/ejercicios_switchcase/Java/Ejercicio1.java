import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero del mes (1-12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes tiene 31 dias.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("El mes tiene 30 dias.");
                break;
            case 2:
                System.out.println("El mes tiene 28 dias.");
                break;
            default:
                System.out.println("Error: El numero debe estar entre 1 y 12.");
                return;
        }

        switch (mes) {
            case 1: System.out.println("Nombre: Enero"); break;
            case 2: System.out.println("Nombre: Febrero"); break;
            case 3: System.out.println("Nombre: Marzo"); break;
            case 4: System.out.println("Nombre: Abril"); break;
            case 5: System.out.println("Nombre: Mayo"); break;
            case 6: System.out.println("Nombre: Junio"); break;
            case 7: System.out.println("Nombre: Julio"); break;
            case 8: System.out.println("Nombre: Agosto"); break;
            case 9: System.out.println("Nombre: Septiembre"); break;
            case 10: System.out.println("Nombre: Octubre"); break;
            case 11: System.out.println("Nombre: Noviembre"); break;
            case 12: System.out.println("Nombre: Diciembre"); break;
        }
    }
}
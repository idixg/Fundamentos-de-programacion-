import java.util.Scanner;

public class consultorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de cita: ");
        int numeroCita = scanner.nextInt();
        
        double costoCita = 0;
        double costoTotal = 0;
        
        if (numeroCita <= 3) {
            costoCita = 900;
            costoTotal = numeroCita * 900;
        } else if (numeroCita <= 5) {
            costoCita = 800;
            costoTotal = (3 * 900) + ((numeroCita - 3) * 800);
        } else if (numeroCita <= 8) {
            costoCita = 600;
            costoTotal = (3 * 900) + (2 * 800) + ((numeroCita - 5) * 600);
        } else {
            costoCita = 500;
            costoTotal = (3 * 900) + (2 * 800) + (3 * 600) + ((numeroCita - 8) * 500);
        }
        
        System.out.println("El pago por esta cita es: $" + costoCita);
        System.out.println("El monto total pagado es: $" + costoTotal);
    }
}

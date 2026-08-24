import java.util.Scanner;

public class estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de horas en el estacionamiento: ");
        int horas = scanner.nextInt();
        
        double totalPagar = 0;
        
        if (horas <= 2) {
            totalPagar = horas * 30;
        } else if (horas <= 5) {
            totalPagar = (2 * 30) + ((horas - 2) * 25);
        } else if (horas <= 10) {
            totalPagar = (2 * 30) + (3 * 25) + ((horas - 5) * 20);
        } else {
            totalPagar = 380;
        }
        
        System.out.println("El total a cobrar es: $" + totalPagar);
        
        scanner.close();
    }
}

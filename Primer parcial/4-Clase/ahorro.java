import java.util.Scanner;

public class ahorro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double ahorroTotal, deposito;
        int mes;
        
        ahorroTotal = 0;
        
        for (mes = 1; mes <= 12; mes++) {
            System.out.print("Ingrese la cantidad ahorrada en el mes " + mes + ": ");
            deposito = scanner.nextDouble();
            
            ahorroTotal = ahorroTotal + deposito;
            
            System.out.println("El ahorro hasta el mes " + mes + " es de: $" + ahorroTotal);
        }
        
        System.out.println("El total de ahorro al año es: $" + ahorroTotal);
        
        scanner.close();
    }
}
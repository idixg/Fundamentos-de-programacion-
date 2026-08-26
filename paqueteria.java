import java.util.Scanner;

public class paqueteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el peso del paquete en gramos: ");
        double pesoGramos = scanner.nextDouble();
        
        if (pesoGramos > 5000) {
            System.out.println("El paquete excede los 5 kg. Entrega rechazada.");
        } else {
            System.out.print("Ingrese la zona (1: N.América, 2: C.América, 3: S.América, 4: Europa, 5: Asia): ");
            int zona = scanner.nextInt();
            
            double costoGramo = 0;
            
            if (zona == 1) {
                costoGramo = 11;
            } else if (zona == 2) {
                costoGramo = 10;
            } else if (zona == 3) {
                costoGramo = 12;
            } else if (zona == 4) {
                costoGramo = 25;
            } else if (zona == 5) {
                costoGramo = 30;
            }
            
            double totalPagar = pesoGramos * costoGramo;
            System.out.println("El costo por el envío es: $" + totalPagar);
        }
        
        scanner.close();
    }
}

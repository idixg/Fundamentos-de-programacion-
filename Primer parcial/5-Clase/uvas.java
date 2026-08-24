import java.util.Scanner;
public class uvas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio inicial por kilo: ");
        double precioInicial = scanner.nextDouble();
        
        System.out.print("Ingrese los kilos entregados: ");
        double kilos = scanner.nextDouble();
        
        System.out.print("Ingrese el tipo de uva (A o B): ");
        char tipo = scanner.next().toUpperCase().charAt(0);
        
        System.out.print("Ingrese el tamaño de uva (1 o 2): ");
        int tamaño = scanner.nextInt();
        double precioFinal = precioInicial;
        
        if (tipo == 'A') {
            if (tamaño == 1) {
                precioFinal += 0.20;
            } else if (tamaño == 2) {
                precioFinal += 0.30;
            }
        } else if (tipo == 'B') {
            if (tamaño == 1) {
                precioFinal -= 0.30;
            } else if (tamaño == 2) {
                precioFinal -= 0.50;
            }
        }
        
        double ganancia = precioFinal * kilos;
        System.out.println("El precio final por kilo es: $" + precioFinal);
        System.out.println("La ganancia total es: $" + ganancia);
        
        scanner.close();
    }
}
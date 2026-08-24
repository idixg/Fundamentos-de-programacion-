import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();
        
        if (num == 0) {
            System.out.println("El número es NEUTRO (Cero).");
        } else if (num % 2 == 0) {
            System.out.println("El número " + num + " es PAR.");
        } else {
            System.out.println("El número " + num + " es IMPAR.");
        }
        
        scanner.close();
    }
}

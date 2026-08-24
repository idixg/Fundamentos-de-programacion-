import java.util.Scanner;

public class Banquetes {
    public static void main(String[] args) {
        int costo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de invitados: ");
        int invitados = sc.nextInt();

        if (invitados < 200) {
            costo = invitados * 95;
            System.out.println("El costo del banquete es: $" + costo);
        } else if (invitados >= 200 && invitados <= 300) {
            costo = invitados * 85;
            System.out.println("El costo del banquete es: $" + costo);
        } else if (invitados > 300) {
            costo = invitados * 75;
            System.out.println("El costo del banquete es: $" + costo);
        }
        
        sc.close();
    }
}
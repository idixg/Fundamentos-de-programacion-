import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero entero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese la operacion (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case '/':
                if (n2 != 0) {
                    System.out.println("Resultado: " + ((double) n1 / n2));
                } else {
                    System.out.println("Error: Division por cero.");
                }
                break;
            default:
                System.out.println("Operador no valido.");
        }
    }
}

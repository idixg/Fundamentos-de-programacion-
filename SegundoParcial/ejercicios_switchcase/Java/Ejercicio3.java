import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU DE AREAS");
        System.out.println("1. Cuadrado\n2. Rectangulo\n3. Triangulo\n4. Circulo");
        System.out.print("Seleccione una opcion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el lado: ");
                double l = sc.nextDouble();
                System.out.println("Area: " + (l * l));
                break;
            case 2:
                System.out.print("Ingrese la base: ");
                double b = sc.nextDouble();
                System.out.print("Ingrese la altura: ");
                double h = sc.nextDouble();
                System.out.println("Area: " + (b * h));
                break;
            case 3:
                System.out.print("Ingrese la base: ");
                double bt = sc.nextDouble();
                System.out.print("Ingrese la altura: ");
                double ht = sc.nextDouble();
                System.out.println("Area: " + (bt * ht / 2.0));
                break;
            case 4:
                System.out.print("Ingrese el radio: ");
                double r = sc.nextDouble();
                System.out.println("Area: " + (Math.PI * r * r));
                break;
            default:
                System.out.println("Opcion invalida.");
        }
    }
}

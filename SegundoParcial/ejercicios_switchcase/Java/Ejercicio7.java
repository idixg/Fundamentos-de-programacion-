import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        System.out.print("Elija el sabor de la tarta (1: Manzana, 2: Fresa, 3: Chocolate): ");
        int opcionSabor = sc.nextInt();

        switch (opcionSabor) {
            case 1:
                total += 200;
                break;
            case 2:
                total += 250;
                break;
            case 3:
                System.out.print("Tipo de chocolate (1: Negro, 2: Blanco): ");
                int opcionChoc = sc.nextInt();
                switch (opcionChoc) {
                    case 1: total += 280; break;
                    case 2: total += 300; break;
                    default: System.out.println("Opcion de chocolate no valida.");
                }
                break;
            default:
                System.out.println("Sabor no valido.");
                return;
        }

        System.out.print("Cuantos snacks desea añadir? ($25 c/u): ");
        int cantidadSnacks = sc.nextInt();
        total += (cantidadSnacks * 25);

        System.out.print("Desea personalizar con un nombre? (1: Si, 2: No): ");
        int respuestaNombre = sc.nextInt();
        if (respuestaNombre == 1) {
            total += 30;
        }

        System.out.println("El presupuesto total de la tarta es: $" + total);
    }
}

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            double total = 0;

            System.out.println("\n----- PASTELERIA -----");
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
                        case 1:
                            total += 280;
                            break;
                        case 2:
                            total += 300;
                            break;
                        default:
                            System.out.println("Opcion de chocolate no valida.");
                            return;
                    }
                    break;

                default:
                    System.out.println("Sabor no valido.");
                    return;
            }

            // Snacks
            System.out.print("¿Desea añadir un snack? (S/N): ");
            char respuestaSnack = sc.next().charAt(0);

            while (respuestaSnack == 'S' || respuestaSnack == 's') {

                System.out.println("\nElija el snack:");
                System.out.println("1. Fresa");
                System.out.println("2. Galleta");
                System.out.println("3. Durazno");
                System.out.print("Opcion: ");
                int opcionSnack = sc.nextInt();

                switch (opcionSnack) {
                    case 1:
                        System.out.println("Se agrego fresa.");
                        total += 25;
                        break;

                    case 2:
                        System.out.println("Se agrego galleta.");
                        total += 25;
                        break;

                    case 3:
                        System.out.println("Se agrego durazno.");
                        total += 25;
                        break;

                    default:
                        System.out.println("Snack no valido.");
                }

                System.out.print("¿Desea añadir otro snack? (S/N): ");
                respuestaSnack = sc.next().charAt(0);
            }

            // Personalizacion
            System.out.print("\n¿Desea personalizar con un nombre? (S/N): ");
            char respuestaNombre = sc.next().charAt(0);

            if (respuestaNombre == 'S' || respuestaNombre == 's') {
                total += 30;
            }

            // Total
            System.out.println("\nEl presupuesto total de la tarta es: $" + total);

            // Otro pedido
            System.out.print("\n¿Desea hacer otro pedido? (S/N): ");
            repetir = sc.next().charAt(0);

        } while (repetir == 'S' || repetir == 's');

        System.out.println("Gracias por su compra.");
    }
}
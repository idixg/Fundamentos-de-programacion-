import java.util.Scanner;

public class ventas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N, i;
        double venta;
        String respuesta;

        int c1 = 0, c2 = 0, c3 = 0;

        // Acumuladores
        double a1 = 0, a2 = 0, a3 = 0, total = 0;

        System.out.print("¿Desea registrar ahorros/ventas el día de hoy? (Si/No): ");
        respuesta = scanner.next();

        while (respuesta.equalsIgnoreCase("Si")) {
            System.out.print("Ingrese la cantidad total de ventas en el día (N): ");
            N = scanner.nextInt();

            i = 1;

            while (i <= N) {
                System.out.print("Ingrese el monto de la venta " + i + ": ");
                venta = scanner.nextDouble();

                total = total + venta;

                if (venta > 1000) {
                    c1 = c1 + 1;
                    a1 = a1 + venta;
                } else if (venta > 500) {
                    c2 = c2 + 1;
                    a2 = a2 + venta;
                } else {
                    c3 = c3 + 1;
                    a3 = a3 + venta;
                }

                i = i + 1;
            }

            System.out.println("Ventas mayores a $1000: " + c1 + " monto: $" + a1);
            System.out.println("Ventas mayores a $500 y hasta $1000: " + c2 + " monto: $" + a2);
            System.out.println("Ventas de $500 o menos: " + c3 + " monto: $" + a3);
            System.out.println("Monto Total Global: $" + total);
            
            respuesta = "No";
        }

        System.out.println("Proceso finalizado. ¡Que tengas un buen día!");

        scanner.close();
    }
}

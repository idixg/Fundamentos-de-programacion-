import java.util.Scanner;

public class TiendaEnlinea {

    // Método para calcular el subtotal de un producto
    static double calcularSubtotalProducto(double precio, int cantidad) {
        return precio * cantidad;
    }

    // Método para calcular el subtotal general
    static double calcularSubtotalGeneral(double subtotal1, double subtotal2, double subtotal3) {
        return subtotal1 + subtotal2 + subtotal3;
    }

    // Método para calcular el descuento
    static double calcularDescuento(double subtotal, int tipoCliente) {
        if (tipoCliente == 2) {
            return subtotal * 0.10;
        } else {
            return 0;
        }
    }

    // Método para calcular el costo de envío
    static double calcularEnvio(double subtotal, String codigoPostal) {
        if (subtotal < 1000) {
            return 150;
        } else if (subtotal < 3000) {
            return 80;
        } else {
            return 0;
        }
    }

    // Método para calcular el impuesto
    static double calcularImpuesto(double subtotalConDescuento) {
        return subtotalConDescuento * 0.16;
    }

    // Método para calcular el total
    static double calcularTotal(double subtotal, double descuento,
                                double impuesto, double envio) {
        return subtotal - descuento + impuesto + envio;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double precio1, precio2, precio3;
        int cantidad1, cantidad2, cantidad3;
        int tipoCliente;
        String codigoPostal;

        // PRODUCTO 1
        System.out.println("----- PRODUCTO 1 -----");

        do {
            System.out.print("Ingresa el precio: $");
            precio1 = entrada.nextDouble();

            if (precio1 <= 0) {
                System.out.println("Error: el precio debe ser mayor que cero.");
            }
        } while (precio1 <= 0);

        do {
            System.out.print("Ingresa la cantidad: ");
            cantidad1 = entrada.nextInt();

            if (cantidad1 <= 0) {
                System.out.println("Error: la cantidad debe ser mayor que cero.");
            }
        } while (cantidad1 <= 0);

        // PRODUCTO 2
        System.out.println("\n----- PRODUCTO 2 -----");

        do {
            System.out.print("Ingresa el precio: $");
            precio2 = entrada.nextDouble();

            if (precio2 <= 0) {
                System.out.println("Error: el precio debe ser mayor que cero.");
            }
        } while (precio2 <= 0);

        do {
            System.out.print("Ingresa la cantidad: ");
            cantidad2 = entrada.nextInt();

            if (cantidad2 <= 0) {
                System.out.println("Error: la cantidad debe ser mayor que cero.");
            }
        } while (cantidad2 <= 0);

        // PRODUCTO 3
        System.out.println("\n----- PRODUCTO 3 -----");

        do {
            System.out.print("Ingresa el precio: $");
            precio3 = entrada.nextDouble();

            if (precio3 <= 0) {
                System.out.println("Error: el precio debe ser mayor que cero.");
            }
        } while (precio3 <= 0);

        do {
            System.out.print("Ingresa la cantidad: ");
            cantidad3 = entrada.nextInt();

            if (cantidad3 <= 0) {
                System.out.println("Error: la cantidad debe ser mayor que cero.");
            }
        } while (cantidad3 <= 0);

        // Calcular subtotales
        double subtotal1 = calcularSubtotalProducto(precio1, cantidad1);
        double subtotal2 = calcularSubtotalProducto(precio2, cantidad2);
        double subtotal3 = calcularSubtotalProducto(precio3, cantidad3);

        double subtotal = calcularSubtotalGeneral(subtotal1, subtotal2, subtotal3);

        // Tipo de cliente
        do {
            System.out.println("\n----- TIPO DE CLIENTE -----");
            System.out.println("1. Cliente regular");
            System.out.println("2. Cliente frecuente");
            System.out.print("Selecciona una opción: ");
            tipoCliente = entrada.nextInt();

            if (tipoCliente != 1 && tipoCliente != 2) {
                System.out.println("Error: solo puedes elegir 1 o 2.");
            }
        } while (tipoCliente != 1 && tipoCliente != 2);

        // Código postal
        entrada.nextLine();

        do {
            System.out.print("\nIngresa el código postal: ");
            codigoPostal = entrada.nextLine();

            if (!codigoPostal.matches("\\d{5}")) {
                System.out.println("Error: el código postal debe contener exactamente cinco dígitos.");
            }
        } while (!codigoPostal.matches("\\d{5}"));

        // Cálculos finales
        double descuento = calcularDescuento(subtotal, tipoCliente);

        double subtotalConDescuento = subtotal - descuento;

        double envio = calcularEnvio(subtotal, codigoPostal);

        double impuesto = calcularImpuesto(subtotalConDescuento);

        double total = calcularTotal(subtotal, descuento, impuesto, envio);

        // Mostrar resultados
        System.out.println("\n========== RESUMEN DE COMPRA ==========");
        System.out.printf("Subtotal producto 1: $%.2f%n", subtotal1);
        System.out.printf("Subtotal producto 2: $%.2f%n", subtotal2);
        System.out.printf("Subtotal producto 3: $%.2f%n", subtotal3);
        System.out.printf("Subtotal general: $%.2f%n", subtotal);
        System.out.printf("Descuento: $%.2f%n", descuento);
        System.out.printf("Subtotal con descuento: $%.2f%n", subtotalConDescuento);
        System.out.printf("Impuesto (16%%): $%.2f%n", impuesto);
        System.out.printf("Costo de envío: $%.2f%n", envio);
        System.out.printf("TOTAL A PAGAR: $%.2f%n", total);

        entrada.close();
    }
}
import java.util.Scanner;

public class ConsumoElectrico {

    // Método para calcular el consumo
    static double calcularConsumo(double lecturaAnterior, double lecturaActual) {
        return lecturaActual - lecturaAnterior;
    }

    // Método para calcular el costo del consumo por bloques acumulativos
    static double calcularCostoConsumo(double consumo) {
        double costo = 0;

        if (consumo <= 150) {
            costo = consumo * 1.20;
        } else if (consumo <= 400) {
            costo = (150 * 1.20) + ((consumo - 150) * 1.80);
        } else {
            costo = (150 * 1.20) + (250 * 1.80) + ((consumo - 400) * 2.75);
        }

        return costo;
    }

    // Método para calcular el descuento del programa de apoyo
    static double calcularDescuentoApoyo(double consumo, double costoAntesImpuesto,
                                         boolean tieneApoyo) {
        if (tieneApoyo && consumo <= 250) {
            return costoAntesImpuesto * 0.30;
        } else {
            return 0;
        }
    }

    // Método para calcular el impuesto
    static double calcularImpuesto(double baseImponible) {
        return baseImponible * 0.16;
    }

    // Método para calcular el total
    static double calcularTotal(double costoConsumo, double cargoFijo,
                                double descuento, double impuesto) {
        return costoConsumo + cargoFijo - descuento + impuesto;
    }

    // Método para mostrar el recibo
    static void mostrarRecibo(double consumo, double costoConsumo,
                              double descuento, double impuesto, double total) {
        double cargoFijo = 95;
        double costoAntesImpuesto = costoConsumo + cargoFijo;

        System.out.println("\n========== RECIBO DE ELECTRICIDAD ==========");
        System.out.printf("Consumo mensual: %.2f kWh%n", consumo);
        System.out.printf("Costo por consumo: $%.2f%n", costoConsumo);
        System.out.printf("Cargo fijo: $%.2f%n", cargoFijo);
        System.out.printf("Costo antes del impuesto: $%.2f%n", costoAntesImpuesto);
        System.out.printf("Descuento por apoyo: $%.2f%n", descuento);
        System.out.printf("Impuesto (16%%): $%.2f%n", impuesto);
        System.out.printf("TOTAL A PAGAR: $%.2f%n", total);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double lecturaAnterior;
        double lecturaActual;
        double consumo;
        int apoyo;

        // Validar lectura anterior
        do {
            System.out.print("Ingresa la lectura anterior: ");
            lecturaAnterior = entrada.nextDouble();

            if (lecturaAnterior < 0) {
                System.out.println("Error: la lectura no puede ser negativa.");
            }

        } while (lecturaAnterior < 0);

        // Validar lectura actual
        do {
            System.out.print("Ingresa la lectura actual: ");
            lecturaActual = entrada.nextDouble();

            if (lecturaActual < 0) {
                System.out.println("Error: la lectura no puede ser negativa.");
            } else if (lecturaActual < lecturaAnterior) {
                System.out.println("Error: la lectura actual debe ser mayor o igual a la anterior.");
            }

        } while (lecturaActual < 0 || lecturaActual < lecturaAnterior);

        // Calcular consumo
        consumo = calcularConsumo(lecturaAnterior, lecturaActual);

        // Validar consumo máximo
        if (consumo > 10000) {
            System.out.println("Error: el consumo máximo permitido es de 10,000 kWh.");
        } else {

            // Preguntar si tiene apoyo
            do {
                System.out.println("\n¿La vivienda pertenece al programa de apoyo?");
                System.out.println("1. Sí");
                System.out.println("2. No");
                System.out.print("Selecciona una opción: ");
                apoyo = entrada.nextInt();

                if (apoyo != 1 && apoyo != 2) {
                    System.out.println("Error: solo puedes elegir 1 o 2.");
                }

            } while (apoyo != 1 && apoyo != 2);

            boolean tieneApoyo = apoyo == 1;

            // Cálculos
            double costoConsumo = calcularCostoConsumo(consumo);

            double cargoFijo = 95;

            double costoAntesImpuesto = costoConsumo + cargoFijo;

            double descuento = calcularDescuentoApoyo(
                    consumo,
                    costoAntesImpuesto,
                    tieneApoyo
            );

            double baseImponible = costoAntesImpuesto - descuento;

            double impuesto = calcularImpuesto(baseImponible);

            double total = calcularTotal(
                    costoConsumo,
                    cargoFijo,
                    descuento,
                    impuesto
            );

            // Mostrar recibo
            mostrarRecibo(consumo, costoConsumo, descuento, impuesto, total);
        }

        entrada.close();
    }
}

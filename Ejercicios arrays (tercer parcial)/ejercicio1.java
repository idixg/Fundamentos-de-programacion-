import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantas sucursales hay?: ");
        int n = sc.nextInt();

        double[][] ventas = new double[n][12];
        double[] totales = new double[n];
        Integer[] orden = new Integer[n];

        // Registrar las ventas de cada sucursal
        for (int i = 0; i < n; i++) {
            System.out.println("\nSucursal " + (i + 1));

            for (int j = 0; j < 12; j++) {
                System.out.print("Ventas del mes " + (j + 1) + ": ");
                ventas[i][j] = sc.nextDouble();

                totales[i] += ventas[i][j];
            }

            orden[i] = i;
        }

        // Calcular el promedio global de ventas anuales
        double sumaGlobal = 0;

        for (int i = 0; i < n; i++) {
            sumaGlobal += totales[i];
        }

        double promedioGlobal = sumaGlobal / n;

        System.out.println("\n--- REPORTE DE VENTAS ---");

        for (int i = 0; i < n; i++) {
            double promedio = totales[i] / 12;
            int mejorMes = 0;

            for (int j = 1; j < 12; j++) {
                if (ventas[i][j] > ventas[i][mejorMes]) {
                    mejorMes = j;
                }
            }

            // Copiar las ventas de la sucursal
            double[] copia = Arrays.copyOf(ventas[i], 12);

            System.out.println("\nSucursal " + (i + 1));
            System.out.println("Ventas mensuales: "
                    + Arrays.toString(copia));
            System.out.println("Total anual: " + totales[i]);
            System.out.println("Promedio mensual: " + promedio);
            System.out.println("Mejor mes: " + (mejorMes + 1));
            System.out.println("Ventas del mejor mes: "
                    + ventas[i][mejorMes]);
        }

        System.out.println("\n--- SUCURSALES SOBRE EL PROMEDIO GLOBAL ---");
        System.out.println("Promedio global anual: " + promedioGlobal);

        for (int i = 0; i < n; i++) {
            if (totales[i] > promedioGlobal) {
                System.out.println("Sucursal " + (i + 1)
                        + ": " + totales[i]);
            }
        }

        // Ordenar los indices por ventas anuales
        Arrays.sort(orden, Comparator.comparingDouble((Integer i) -> totales[i]).reversed());

        System.out.println("\n--- RANKING DE SUCURSALES ---");

        for (int i = 0; i < n; i++) {
            int sucursal = orden[i];

            System.out.println((i + 1) + ". Sucursal "
                    + (sucursal + 1) + " - Total anual: "
                    + totales[sucursal]);
        }

        sc.close();
    }
}
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, m;
        double precio;

        System.out.print("Ingrese el numero de vendedores: ");
        n = sc.nextInt();

        System.out.print("Ingrese el numero de zonas: ");
        m = sc.nextInt();

        System.out.print("Ingrese el precio de una computadora: ");
        precio = sc.nextDouble();

        int[][] ventas = new int[n][m];

        // Llenar la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print("Vendedor " + (i + 1)
                        + ", zona " + (j + 1) + ": ");

                ventas[i][j] = sc.nextInt();
            }
        }

        // Mostrar matriz
        System.out.println("\nMATRIZ DE VENTAS");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(ventas[i][j] + "\t");
            }

            System.out.println();
        }

        // Zona que mas computadoras vendio
        int mayorZona = 0;
        int zonaMayor = 0;

        for (int j = 0; j < m; j++) {

            int sumaZona = 0;

            for (int i = 0; i < n; i++) {
                sumaZona += ventas[i][j];
            }

            if (sumaZona > mayorZona) {
                mayorZona = sumaZona;
                zonaMayor = j;
            }
        }

        System.out.println("\nLa zona que mas computadoras vendio fue la zona "
                + (zonaMayor + 1)
                + " con " + mayorZona + " computadoras.");

        System.out.println("Venta de la zona: $"
                + (mayorZona * precio));

        // Vendedor que menos vendio
        int menorVendedor = Integer.MAX_VALUE;
        int vendedorMenor = 0;

        // Vendedor que mas vendio
        int mayorVendedor = 0;
        int vendedorMayor = 0;

        for (int i = 0; i < n; i++) {

            int sumaVendedor = 0;

            for (int j = 0; j < m; j++) {
                sumaVendedor += ventas[i][j];
            }

            if (sumaVendedor < menorVendedor) {
                menorVendedor = sumaVendedor;
                vendedorMenor = i;
            }

            if (sumaVendedor > mayorVendedor) {
                mayorVendedor = sumaVendedor;
                vendedorMayor = i;
            }
        }

        // Vendedor que menos vendio
        System.out.println("\nEl vendedor que menos computadoras vendio fue el vendedor "
                + (vendedorMenor + 1));

        System.out.println("Cantidad: " + menorVendedor);

        System.out.println("Venta total: $"
                + (menorVendedor * precio));

        // Vendedor que mas vendio
        System.out.println("\nEl vendedor que mas computadoras vendio fue el vendedor "
                + (vendedorMayor + 1));

        System.out.println("Cantidad: " + mayorVendedor);

        System.out.println("Venta total: $"
                + (mayorVendedor * precio));

        // Total de computadoras vendidas
        int total = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                total += ventas[i][j];
            }
        }

        System.out.println("\nCantidad total de computadoras vendidas: "
                + total);

        System.out.println("Venta total: $"
                + (total * precio));

        sc.close();
    }
}
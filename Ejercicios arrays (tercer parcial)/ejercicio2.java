import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos identificadores ingresaras?: ");
        int n = sc.nextInt();

        int[] original = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Identificador " + (i + 1) + ": ");
            original[i] = sc.nextInt();
        }

        
        int[] copiaOrdenada = Arrays.copyOf(original, n);
        Arrays.sort(copiaOrdenada);

      
        int[] depurado = new int[n];
        int cantidad = 0;

        for (int i = 0; i < n; i++) {
            boolean existe = false;

            for (int j = 0; j < cantidad; j++) {
                if (original[i] == depurado[j]) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                depurado[cantidad] = original[i];
                cantidad++;
            }
        }

        
        depurado = Arrays.copyOf(depurado, cantidad);

        System.out.println("\nArreglo original: "
                + Arrays.toString(original));

        System.out.println("Arreglo depurado: "
                + Arrays.toString(depurado));

       
        System.out.print("Identificadores duplicados: ");
        boolean hayDuplicados = false;

        for (int i = 0; i < n; i++) {
            int frecuencia = 0;

            for (int j = 0; j < n; j++) {
                if (copiaOrdenada[i] == copiaOrdenada[j]) {
                    frecuencia++;
                }
            }

            if (frecuencia > 1) {
                boolean yaMostrado = false;

                for (int j = 0; j < i; j++) {
                    if (copiaOrdenada[i] == copiaOrdenada[j]) {
                        yaMostrado = true;
                        break;
                    }
                }

                if (!yaMostrado) {
                    
                    boolean primeraAparicion = true;

                    for (int j = 0; j < i; j++) {
                        if (copiaOrdenada[j] == copiaOrdenada[i]) {
                            primeraAparicion = false;
                            break;
                        }
                    }

                    if (primeraAparicion) {
                        if (hayDuplicados) {
                            System.out.print(", ");
                        }

                        System.out.print(copiaOrdenada[i]);
                        hayDuplicados = true;
                    }
                }
            }
        }

        if (!hayDuplicados) {
            System.out.print("Ninguno");
        }

        
        int eliminados = n - cantidad;

        System.out.println("\nRegistros eliminados: " + eliminados);

        sc.close();
    }
}
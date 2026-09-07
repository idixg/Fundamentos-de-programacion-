import java.util.Scanner;

public class Figura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.print("Ingresa el número de líneas: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        entrada.close();
    }
}

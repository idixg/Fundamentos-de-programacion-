import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, m;

        System.out.print("Ingrese el numero de estudiantes: ");
        n = sc.nextInt();

        System.out.print("Ingrese el numero de examenes: ");
        m = sc.nextInt();

        double[][] calificaciones = new double[n][m];
        double[] promedios = new double[n];

        // Llenar la matriz
        for (int i = 0; i < n; i++) {

            System.out.println("\nEstudiante " + (i + 1));

            for (int j = 0; j < m; j++) {

                System.out.print("Calificacion del examen " + (j + 1) + ": ");
                calificaciones[i][j] = sc.nextDouble();
            }
        }

        // Mostrar matriz original
        System.out.println("\nMATRIZ DE CALIFICACIONES");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(calificaciones[i][j] + "\t");
            }

            System.out.println();
        }

        // Calcular promedio de cada estudiante
        for (int i = 0; i < n; i++) {

            double suma = 0;

            for (int j = 0; j < m; j++) {
                suma += calificaciones[i][j];
            }

            promedios[i] = suma / m;
        }

        // Mostrar promedio de cada estudiante
        System.out.println("\nPROMEDIO DE CADA ESTUDIANTE");

        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + promedios[i]);
        }

        // Encontrar el mejor promedio
        double mejor = promedios[0];

        for (int i = 1; i < n; i++) {

            if (promedios[i] > mejor) {
                mejor = promedios[i];
            }
        }

        System.out.println("\nMEJOR PROMEDIO: " + mejor);

        // Contar alumnos con promedio entre 9 y 10
        int cantidadBuenos = 0;

        for (int i = 0; i < n; i++) {

            if (promedios[i] >= 9 && promedios[i] <= 10) {
                cantidadBuenos++;
            }
        }

        // Matriz de alumnos con promedio entre 9 y 10
        // Columna 0 = numero de alumno
        // Columna 1 = promedio
        double[][] buenos = new double[cantidadBuenos][2];

        int fila = 0;

        for (int i = 0; i < n; i++) {

            if (promedios[i] >= 9 && promedios[i] <= 10) {

                buenos[fila][0] = i + 1;
                buenos[fila][1] = promedios[i];

                fila++;
            }
        }

        System.out.println("\nALUMNOS CON PROMEDIO ENTRE 9 Y 10");

        if (cantidadBuenos == 0) {

            System.out.println("No hay alumnos con promedio entre 9 y 10.");

        } else {

            for (int i = 0; i < cantidadBuenos; i++) {

                System.out.println("Estudiante "
                        + (int)buenos[i][0]
                        + " - Promedio: "
                        + buenos[i][1]);
            }
        }

        // Contar alumnos con promedio menor a 7
        int cantidadBajos = 0;

        for (int i = 0; i < n; i++) {

            if (promedios[i] < 7) {
                cantidadBajos++;
            }
        }

        // Matriz de alumnos con promedio menor a 7
        double[][] bajos = new double[cantidadBajos][2];

        fila = 0;

        for (int i = 0; i < n; i++) {

            if (promedios[i] < 7) {

                bajos[fila][0] = i + 1;
                bajos[fila][1] = promedios[i];

                fila++;
            }
        }

        System.out.println("\nALUMNOS CON PROMEDIO MENOR A 7");

        if (cantidadBajos == 0) {

            System.out.println("No hay alumnos con promedio menor a 7.");

        } else {

            for (int i = 0; i < cantidadBajos; i++) {

                System.out.println("Estudiante "
                        + (int)bajos[i][0]
                        + " - Promedio: "
                        + bajos[i][1]);
            }
        }

        // Examen con promedio mas alto
        double mayorExamen = 0;
        int examenMayor = 0;

        for (int j = 0; j < m; j++) {

            double suma = 0;

            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }

            double promedio = suma / n;

            if (j == 0 || promedio > mayorExamen) {
                mayorExamen = promedio;
                examenMayor = j;
            }
        }

        System.out.println("\nEXAMEN CON MAYOR PROMEDIO");
        System.out.println("Examen " + (examenMayor + 1));
        System.out.println("Promedio: " + mayorExamen);

        // Examen con promedio mas bajo
        double menorExamen = 0;
        int examenMenor = 0;

        for (int j = 0; j < m; j++) {

            double suma = 0;

            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }

            double promedio = suma / n;

            if (j == 0 || promedio < menorExamen) {
                menorExamen = promedio;
                examenMenor = j;
            }
        }

        System.out.println("\nEXAMEN CON MENOR PROMEDIO");
        System.out.println("Examen " + (examenMenor + 1));
        System.out.println("Promedio: " + menorExamen);

        sc.close();
    }
}
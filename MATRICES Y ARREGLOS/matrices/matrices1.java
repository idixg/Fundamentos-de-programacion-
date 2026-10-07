import java.util.Scanner;

public class matrices1 {
    public static void main(String[] args) {

        System.out.println("EJEMPLO DE MATRICES");

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas filas tendrá la matriz?");
        int filas = sc.nextInt();

        System.out.println("¿Cuántas columnas tendrá la matriz?");
        int columnas = sc.nextInt();

        int[][] A = new int[filas][columnas];
        boolean[][] ocupado = new boolean[filas][columnas];

        boolean lleno = false;

        int opcion;

        do {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Llenado");
            System.out.println("2. Visualización");
            System.out.println("3. Modificación");
            System.out.println("4. Eliminación");
            System.out.println("5. Búsqueda");
            System.out.println("6. Actualización");
            System.out.println("7. Orden ascendente");
            System.out.println("8. Orden descendente");
            System.out.println("9. Salir");
            System.out.println("Selecciona una opción:");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\n===== LLENADO DE LA MATRIZ =====");

                    if (lleno) {

                        System.out.println("Ya existen elementos en la matriz.");
                        System.out.println("¿Deseas reemplazarlos? (1 = Sí, 2 = No)");
                        int respuesta = sc.nextInt();

                        if (respuesta == 1) {

                            for (int i = 0; i < filas; i++) {
                                for (int j = 0; j < columnas; j++) {

                                    int posicion = i * columnas + j;

                                    System.out.println("Introduce el valor " + posicion + ":");
                                    A[i][j] = sc.nextInt();
                                    ocupado[i][j] = true;
                                }
                            }

                            lleno = true;

                            System.out.println("Matriz llenada nuevamente.");

                        } else {
                            System.out.println("No se modificó la matriz.");
                        }

                    } else {

                        for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {

                                int posicion = i * columnas + j;

                                System.out.println("Introduce el valor " + posicion + ":");
                                A[i][j] = sc.nextInt();
                                ocupado[i][j] = true;
                            }
                        }

                        lleno = true;

                        System.out.println("Matriz llenada correctamente.");
                    }

                    break;

                case 2:
                    System.out.println("\n===== VISUALIZACIÓN DE LA MATRIZ =====");

                    if (lleno) {

                        for (int i = 0; i < filas; i++) {

                            for (int j = 0; j < columnas; j++) {
                                System.out.print(A[i][j] + "\t");
                            }

                            System.out.println();
                        }

                    } else {
                        System.out.println("La matriz está vacía.");
                    }

                    break;

                case 3:
                    System.out.println("\n===== MODIFICACIÓN DE LA MATRIZ =====");

                    if (lleno) {

                        System.out.println("¿Qué posición deseas modificar?");
                        int posicion = sc.nextInt();

                        if (posicion >= 0 && posicion < filas * columnas) {

                            int fila = posicion / columnas;
                            int columna = posicion % columnas;

                            if (ocupado[fila][columna]) {

                                System.out.println("Valor actual: " + A[fila][columna]);

                                System.out.println("Introduce el nuevo valor:");
                                int nuevoValor = sc.nextInt();

                                A[fila][columna] = nuevoValor;

                                System.out.println("Valor modificado correctamente.");

                            } else {
                                System.out.println("La posición está vacía.");
                            }

                        } else {
                            System.out.println("Posición no válida.");
                        }

                    } else {
                        System.out.println("La matriz está vacía.");
                    }

                    break;

                case 4:
                    System.out.println("\n===== ELIMINACIÓN =====");

                    if (lleno) {

                        System.out.println("¿Qué posición deseas eliminar?");
                        int posicionEliminar = sc.nextInt();

                        if (posicionEliminar >= 0 && posicionEliminar < filas * columnas) {

                            int fila = posicionEliminar / columnas;
                            int columna = posicionEliminar % columnas;

                            if (ocupado[fila][columna]) {

                                A[fila][columna] = 0;
                                ocupado[fila][columna] = false;

                                System.out.println("Elemento eliminado correctamente.");

                                boolean hayElementos = false;

                                for (int i = 0; i < filas; i++) {
                                    for (int j = 0; j < columnas; j++) {

                                        if (ocupado[i][j]) {
                                            hayElementos = true;
                                        }
                                    }
                                }

                                lleno = hayElementos;

                            } else {
                                System.out.println("La posición está vacía.");
                            }

                        } else {
                            System.out.println("Posición no válida.");
                        }

                    } else {
                        System.out.println("La matriz está vacía.");
                    }

                    break;

                case 5:
                    System.out.println("\n===== BÚSQUEDA =====");

                    if (lleno) {

                        System.out.println("¿Qué valor deseas buscar?");
                        int buscar = sc.nextInt();

                        boolean encontrado = false;

                        for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {

                                if (ocupado[i][j] && A[i][j] == buscar) {
                                    encontrado = true;
                                }
                            }
                        }

                        if (encontrado) {
                            System.out.println("El valor se encuentra en la matriz.");
                        } else {
                            System.out.println("El valor no se encuentra en la matriz.");
                        }

                    } else {
                        System.out.println("La matriz está vacía.");
                    }

                    break;

                case 6:
                    System.out.println("\n===== ACTUALIZACIÓN =====");

                    boolean hayEspacio = false;

                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {

                            if (!ocupado[i][j]) {
                                hayEspacio = true;
                            }
                        }
                    }

                    if (hayEspacio) {

                        System.out.println("Espacios disponibles:");

                        for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {

                                if (!ocupado[i][j]) {

                                    int posicion = i * columnas + j;

                                    System.out.print(posicion + " ");
                                }
                            }
                        }

                        System.out.println();

                        System.out.println("¿Qué posición deseas actualizar?");
                        int posicionActualizar = sc.nextInt();

                        if (posicionActualizar >= 0
                                && posicionActualizar < filas * columnas) {

                            int fila = posicionActualizar / columnas;
                            int columna = posicionActualizar % columnas;

                            if (!ocupado[fila][columna]) {

                                System.out.println("Introduce el nuevo valor:");
                                int nuevoValor = sc.nextInt();

                                A[fila][columna] = nuevoValor;
                                ocupado[fila][columna] = true;

                                lleno = true;

                                System.out.println("Elemento actualizado correctamente.");

                            } else {
                                System.out.println("Esa posición ya tiene un elemento.");
                            }

                        } else {
                            System.out.println("Posición no válida.");
                        }

                    } else {

                        System.out.println("No hay espacios vacíos para actualizar.");

                    }

                    break;

                case 7:
                    System.out.println("\n===== ORDEN ASCENDENTE =====");

                    if (lleno) {

                        for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {

                                if (!ocupado[i][j]) {
                                    continue;
                                }

                                for (int x = i; x < filas; x++) {

                                    int inicio;

                                    if (x == i) {
                                        inicio = j + 1;
                                    } else {
                                        inicio = 0;
                                    }

                                    for (int y = inicio; y < columnas; y++) {

                                        if (ocupado[x][y] && A[i][j] > A[x][y]) {

                                            int aux = A[i][j];
                                            A[i][j] = A[x][y];
                                            A[x][y] = aux;
                                        }
                                    }
                                }
                            }
                        }

                        for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {
                                System.out.print(A[i][j] + "\t");
                            }

                            System.out.println();
                        }

                    } else {
                        System.out.println("La matriz está vacía.");
                    }

                    break;

                case 8:
                    System.out.println("\n===== ORDEN DESCENDENTE =====");

                    if (lleno) {

                        for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {

                                if (!ocupado[i][j]) {
                                    continue;
                                }

                                for (int x = i; x < filas; x++) {

                                    int inicio;

                                    if (x == i) {
                                        inicio = j + 1;
                                    } else {
                                        inicio = 0;
                                    }

                                    for (int y = inicio; y < columnas; y++) {

                                        if (ocupado[x][y] && A[i][j] < A[x][y]) {

                                            int aux = A[i][j];
                                            A[i][j] = A[x][y];
                                            A[x][y] = aux;
                                        }
                                    }
                                }
                            }
                        }

                        for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {
                                System.out.print(A[i][j] + "\t");
                            }

                            System.out.println();
                        }

                    } else {
                        System.out.println("La matriz está vacía.");
                    }

                    break;

                case 9:
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 9);

        sc.close();
    }
}
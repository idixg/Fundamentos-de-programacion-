import java.util.Scanner;

public class arreglos1 {
    public static void main(String[] args) {

        System.out.println("EJEMPLO DE ARREGLOS UNIDIMENSIONALES");

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos elementos va a guardar en el arreglo?");
        int N = sc.nextInt();

        int[] A = new int[N];
        boolean[] ocupado = new boolean[N];

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

                    System.out.println("\n===== LLENADO DEL ARREGLO =====");

                    boolean existen = false;

                    for (int i = 0; i < A.length; i++) {
                        if (ocupado[i]) {
                            existen = true;
                            break;
                        }
                    }

                    if (existen) {

                        System.out.println("Ya existen elementos en el arreglo.");

                    } else {

                        for (int i = 0; i < A.length; i++) {

                            System.out.println("Introduce el valor " + (i + 1) + ":");
                            A[i] = sc.nextInt();

                            ocupado[i] = true;
                        }

                        System.out.println("Arreglo llenado correctamente.");
                    }

                    break;


                case 2:

                    System.out.println("\n===== VISUALIZACIÓN DEL ARREGLO =====");

                    for (int i = 0; i < A.length; i++) {
                        System.out.print(A[i] + " ");
                    }

                    System.out.println();

                    break;


                case 3:

                    System.out.println("\n===== MODIFICACIÓN DEL ARREGLO =====");

                    System.out.println("¿Qué posición deseas modificar?");
                    int indiceModificar = sc.nextInt();

                    if (indiceModificar >= 0 &&
                        indiceModificar < A.length &&
                        ocupado[indiceModificar]) {

                        System.out.println("Valor actual: " + A[indiceModificar]);

                        System.out.println("Introduce el nuevo valor:");
                        int nuevoValor = sc.nextInt();

                        A[indiceModificar] = nuevoValor;

                        System.out.println("Valor modificado correctamente.");

                    } else {

                        System.out.println("Ese espacio está vacío o no es válido.");
                    }

                    break;


                case 4:

                    System.out.println("\n===== ELIMINACIÓN =====");

                    System.out.println("¿Qué posición deseas eliminar?");
                    int indiceEliminar = sc.nextInt();

                    if (indiceEliminar >= 0 &&
                        indiceEliminar < A.length &&
                        ocupado[indiceEliminar]) {

                        A[indiceEliminar] = 0;
                        ocupado[indiceEliminar] = false;

                        System.out.println("Elemento eliminado correctamente.");

                    } else {

                        System.out.println("Ese espacio está vacío o no es válido.");
                    }

                    break;


                case 5:

                    System.out.println("\n===== BÚSQUEDA =====");

                    System.out.println("¿Qué valor deseas buscar?");
                    int buscar = sc.nextInt();

                    boolean encontrado = false;

                    for (int i = 0; i < A.length; i++) {

                        if (ocupado[i] && A[i] == buscar) {

                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {

                        System.out.println("El valor se encuentra en el arreglo.");

                    } else {

                        System.out.println("El valor no se encuentra en el arreglo.");
                    }

                    break;


                case 6:

                    System.out.println("\n===== ACTUALIZACIÓN =====");

                    boolean hayVacio = false;

                    System.out.println("Posiciones vacías disponibles:");

                    for (int i = 0; i < A.length; i++) {

                        if (!ocupado[i]) {

                            System.out.println(i);
                            hayVacio = true;
                        }
                    }

                    if (!hayVacio) {

                        System.out.println("No hay espacios vacíos para actualizar.");
                        System.out.println("Primero debes eliminar un elemento.");

                    } else {

                        System.out.println("¿Qué espacio vacío deseas actualizar?");
                        int indiceActualizar = sc.nextInt();

                        if (indiceActualizar >= 0 &&
                            indiceActualizar < A.length &&
                            !ocupado[indiceActualizar]) {

                            System.out.println("Introduce el nuevo valor:");
                            int nuevo = sc.nextInt();

                            A[indiceActualizar] = nuevo;
                            ocupado[indiceActualizar] = true;

                            System.out.println("Espacio actualizado correctamente.");

                        } else {

                            System.out.println("Ese espacio está ocupado o no es válido.");
                        }
                    }

                    break;


                case 7:

                    System.out.println("\n===== ORDEN ASCENDENTE =====");

                    for (int i = 0; i < A.length - 1; i++) {

                        if (!ocupado[i]) {
                            continue;
                        }

                        for (int j = i + 1; j < A.length; j++) {

                            if (ocupado[j] && A[i] > A[j]) {

                                int aux = A[i];
                                A[i] = A[j];
                                A[j] = aux;
                            }
                        }
                    }

                    for (int i = 0; i < A.length; i++) {
                        System.out.print(A[i] + " ");
                    }

                    System.out.println();

                    break;


                case 8:

                    System.out.println("\n===== ORDEN DESCENDENTE =====");

                    for (int i = 0; i < A.length - 1; i++) {

                        if (!ocupado[i]) {
                            continue;
                        }

                        for (int j = i + 1; j < A.length; j++) {

                            if (ocupado[j] && A[i] < A[j]) {

                                int aux = A[i];
                                A[i] = A[j];
                                A[j] = aux;
                            }
                        }
                    }

                    for (int i = 0; i < A.length; i++) {
                        System.out.print(A[i] + " ");
                    }

                    System.out.println();

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
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        boolean llena = false;
        int opcion;

        do {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Rellenar matriz");
            System.out.println("2. Suma de filas y columnas");
            System.out.println("3. Suma de una fila");
            System.out.println("4. Suma de una columna");
            System.out.println("5. Mayor y menor");
            System.out.println("6. Contar pares");
            System.out.println("7. Contar impares");
            System.out.println("8. Matriz con cuadrados");
            System.out.println("9. Suma diagonal principal");
            System.out.println("10. Suma diagonal inversa");
            System.out.println("11. Media de todos los valores");
            System.out.println("12. Salir");

            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {

                        int valor;
                        boolean repetido;

                        do {

                            repetido = false;

                            System.out.print("Introduce un valor: ");
                            valor = sc.nextInt();

                            for (int x = 0; x < 4; x++) {
                                for (int y = 0; y < 4; y++) {

                                    if (matriz[x][y] == valor) {
                                        repetido = true;
                                    }
                                }
                            }

                            if (repetido) {
                                System.out.println("El valor ya se encuentra en la matriz. Introduce otro.");
                            }

                        } while (repetido);

                        matriz[i][j] = valor;
                    }
                }

                llena = true;

                System.out.println("\nMATRIZ");

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println();
                }

            } else if (opcion >= 2 && opcion <= 11) {

                if (!llena) {

                    System.out.println("\nDebes rellenar la matriz primero.");

                } else {

                    // Mostrar matriz original
                    System.out.println("\nMATRIZ ORIGINAL");

                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print(matriz[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    // Suma de filas y columnas
                    if (opcion == 2) {

                        System.out.println("\nSUMA DE FILAS");

                        for (int i = 0; i < 4; i++) {

                            int suma = 0;

                            for (int j = 0; j < 4; j++) {
                                suma += matriz[i][j];
                            }

                            System.out.println("Fila " + (i + 1) + ": " + suma);
                        }

                        System.out.println("\nSUMA DE COLUMNAS");

                        for (int j = 0; j < 4; j++) {

                            int suma = 0;

                            for (int i = 0; i < 4; i++) {
                                suma += matriz[i][j];
                            }

                            System.out.println("Columna " + (j + 1) + ": " + suma);
                        }

                    }

                    // Suma de una fila
                    else if (opcion == 3) {

                        int fila;

                        do {
                            System.out.print("\nIndica la fila (1-4): ");
                            fila = sc.nextInt();

                            if (fila < 1 || fila > 4) {
                                System.out.println("Fila incorrecta.");
                            }

                        } while (fila < 1 || fila > 4);

                        int suma = 0;

                        for (int j = 0; j < 4; j++) {
                            suma += matriz[fila - 1][j];
                        }

                        System.out.println("La suma de la fila es: " + suma);
                    }

                    // Suma de una columna
                    else if (opcion == 4) {

                        int columna;

                        do {
                            System.out.print("\nIndica la columna (1-4): ");
                            columna = sc.nextInt();

                            if (columna < 1 || columna > 4) {
                                System.out.println("Columna incorrecta.");
                            }

                        } while (columna < 1 || columna > 4);

                        int suma = 0;

                        for (int i = 0; i < 4; i++) {
                            suma += matriz[i][columna - 1];
                        }

                        System.out.println("La suma de la columna es: " + suma);
                    }

                    // Mayor y menor
                    else if (opcion == 5) {

                        int mayor = matriz[0][0];
                        int menor = matriz[0][0];

                        int filaMayor = 0;
                        int columnaMayor = 0;

                        int filaMenor = 0;
                        int columnaMenor = 0;

                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {

                                if (matriz[i][j] > mayor) {
                                    mayor = matriz[i][j];
                                    filaMayor = i;
                                    columnaMayor = j;
                                }

                                if (matriz[i][j] < menor) {
                                    menor = matriz[i][j];
                                    filaMenor = i;
                                    columnaMenor = j;
                                }
                            }
                        }

                        System.out.println("\nMayor: " + mayor);
                        System.out.println("Posicion: fila " + (filaMayor + 1)
                                + ", columna " + (columnaMayor + 1));

                        System.out.println("\nMenor: " + menor);
                        System.out.println("Posicion: fila " + (filaMenor + 1)
                                + ", columna " + (columnaMenor + 1));
                    }

                    // Pares
                    else if (opcion == 6) {

                        int pares = 0;

                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {

                                if (matriz[i][j] % 2 == 0) {
                                    pares++;
                                }
                            }
                        }

                        System.out.println("\nCantidad de numeros pares: " + pares);
                    }

                    // Impares
                    else if (opcion == 7) {

                        int impares = 0;

                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {

                                if (matriz[i][j] % 2 != 0) {
                                    impares++;
                                }
                            }
                        }

                        System.out.println("\nCantidad de numeros impares: " + impares);
                    }

                    // Matriz de cuadrados
                    else if (opcion == 8) {

                        int[][] cuadrados = new int[4][4];

                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                cuadrados[i][j] = matriz[i][j] * matriz[i][j];
                            }
                        }

                        System.out.println("\nMATRIZ DE CUADRADOS");

                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.print(cuadrados[i][j] + "\t");
                            }
                            System.out.println();
                        }
                    }

                    // Diagonal principal
                    else if (opcion == 9) {

                        int suma = 0;

                        for (int i = 0; i < 4; i++) {
                            suma += matriz[i][i];
                        }

                        System.out.println("\nSuma de la diagonal principal: " + suma);
                    }

                    // Diagonal inversa
                    else if (opcion == 10) {

                        int suma = 0;

                        for (int i = 0; i < 4; i++) {
                            suma += matriz[i][3 - i];
                        }

                        System.out.println("\nSuma de la diagonal inversa: " + suma);
                    }

                    // Media
                    else if (opcion == 11) {

                        int suma = 0;

                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                suma += matriz[i][j];
                            }
                        }

                        double media = suma / 16.0;

                        System.out.println("\nLa media de todos los valores es: " + media);
                    }
                }

            } else if (opcion != 12) {

                System.out.println("\nOpcion incorrecta.");

            }

        } while (opcion != 12);

        System.out.println("\nPrograma terminado.");

        sc.close();
    }
}

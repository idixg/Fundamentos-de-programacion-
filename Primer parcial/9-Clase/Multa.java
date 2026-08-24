import java.util.Scanner;

public class Multa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la velocidad: ");
        int velocidad = scanner.nextInt();
        
        System.out.print("¿Es tu cumpleaños? (true/false): ");
        boolean esCumple = scanner.nextBoolean();
        
        int resultado;
        
        if (esCumple) {
            if (velocidad <= 300) {
                resultado = 0;
            } else if (velocidad <= 400) {
                resultado = 1;
            } else {
                resultado = 2;
            }
        } else {
            if (velocidad <= 60) {
                resultado = 0;
            } else if (velocidad <= 80) {
                resultado = 1;
            } else {
                resultado = 2;
            }
        }
        
        System.out.println("Resultado: " + resultado);
    }
}
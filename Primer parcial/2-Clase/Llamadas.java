import java.util.Scanner;

public class Llamadas {
    public static void main(String[] args){
        double costo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de minutos: ");
        int minutos = sc.nextInt();

        if (minutos<=5){
            costo=minutos *1;
        } else if (minutos>=7 && minutos <=10){
            costo= (5)+(1.6)+(2.1)+(minutos-10)*0.5;
        }
        System.out.print("Introduzca el dia de la semana (Número): ");
        int dia = sc.nextInt();
        if (dia==7){
            costo=costo*1.03;
        } else if (dia>=1 && dia<=5){
            System.out.println("¿En que horario se realizó la llmada? (1) Matutino (2) Vespertino");
            int horario = sc.nextInt();
            if (horario == 1){
                costo =costo* 1.15;
            } else if (horario == 2){
                costo = costo* 1.10;
            }

        }
        System.out.println("El costo de la llamada es: $" + costo);

    }
    
}

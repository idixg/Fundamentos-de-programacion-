import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dia de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el numero de mes (1-12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1: System.out.println(dia <= 19 ? "Capricornio" : "Acuario"); break;
            case 2: System.out.println(dia <= 18 ? "Acuario" : "Piscis"); break;
            case 3: System.out.println(dia <= 20 ? "Piscis" : "Aries"); break;
            case 4: System.out.println(dia <= 19 ? "Aries" : "Tauro"); break;
            case 5: System.out.println(dia <= 20 ? "Tauro" : "Geminis"); break;
            case 6: System.out.println(dia <= 20 ? "Geminis" : "Cancer"); break;
            case 7: System.out.println(dia <= 22 ? "Cancer" : "Leo"); break;
            case 8: System.out.println(dia <= 22 ? "Leo" : "Virgo"); break;
            case 9: System.out.println(dia <= 22 ? "Virgo" : "Libra"); break;
            case 10: System.out.println(dia <= 22 ? "Libra" : "Escorpio"); break;
            case 11: System.out.println(dia <= 21 ? "Escorpio" : "Sagitario"); break;
            case 12: System.out.println(dia <= 21 ? "Sagitario" : "Capricornio"); break;
            default: System.out.println("Mes invalido.");
        }
    }
}
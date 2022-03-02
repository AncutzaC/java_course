package chapter2;
import java.util.Scanner;
public class GrossPayCalculator {
    public static void main (String arg[]) {
        System.out.println("Cate ore ai lucrat pe luna?");
        Scanner scanner = new Scanner (System.in);
        int ore = scanner.nextInt();

        System.out.println("Introdu plata pe ora");
        double plata = scanner.nextDouble();
        scanner.close();

        double platatotala = ore * plata;

        System.out.println("Salariu brut este " + platatotala);
    }

}

package chapter3;

import java.util.Scanner;

public class MediaTestelorStudenti {
    public static void main (String args[]){
        int numarteste = 4;
        int numarstudenti = 24;

        Scanner sc= new Scanner(System.in);

        for (int i=0; i<numarstudenti; i++){
            double notatest=0;
            for (int j=0; j<numarteste; j++){
                System.out.println("Introdu nota " + (j+1) + " a studentului nr " + (i+1));
                double nota= sc.nextDouble();
                notatest= notatest + nota;}
            System.out.println("Media notelor studentului numarul "+ (i+1) + " este: "+ notatest/numarteste);
        }

        sc.close();

    }
}

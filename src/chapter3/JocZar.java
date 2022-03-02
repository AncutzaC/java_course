package chapter3;

import java.util.Random;
import java.util.Scanner;

public class JocZar {
    public static void main (String args[]){

        int numberroll=5;
        int numberspaces=20;
        int place=0;

        Scanner sc= new Scanner(System.in);

        for (int i=0; i<numberroll; i++){

            Random r = new Random();
            int low = 1; int high = 6;
            int dice = r.nextInt(high-low) + low;
            place = place + dice;
            if (place>numberspaces){System.out.println("No advance on the space."+ place +" is a bug.");
                break;}
            else {System.out.println("You rolled" + dice+ ". You are on the "+ place + " square. You need "+ (numberspaces-place)+ " squares to win.");}
            if (i == (numberroll-1) && place<numberspaces){System.out.println("You won!");}
            if (i == (numberroll-1) && place>numberspaces){System.out.println("You lost!");}

        sc.close();

    }
}}

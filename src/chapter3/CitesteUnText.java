package chapter3;

import java.util.Scanner;

public class CitesteUnText {
    public static void main (String args[]){

        System.out.println("Introduceti sirul de litere " +
                "fara virgula");
        Scanner sc = new Scanner(System.in);
        String sir =sc.next();
        sc.close();

        boolean literaagasita = false;

        for (int i = 0; i<sir.length(); i++){
            char literacurenta = sir.charAt(i);
            if (literacurenta == 'a' || literacurenta == 'A'){
                                literaagasita = true;
                break;
            }}
        if (literaagasita){System.out.println("Litera A/a a fost" +
                " gasita");}
            else {System.out.println("Litera A/a nu a " +
                "fost gasita");}
        }

    }

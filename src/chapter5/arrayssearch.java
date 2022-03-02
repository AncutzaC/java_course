package chapter5;

import java.util.Random;

public class arrayssearch {
    public static final int LENGTH = 6;
    public static final int MAX_TICKET_NUMBER=69;

    public static void main (String [] args){
        int[] ticket =generateNumbers();
        printTicket(ticket);
    }
    public static int[] generateNumbers(){
        int [] ticket = new int[LENGTH];
        Random random = new Random ();

        for (int i=0; i<LENGTH; i++){
            int randomNumber;
            do {
                randomNumber= random.nextInt(MAX_TICKET_NUMBER)+1;}
            while (search(ticket, randomNumber));
        ticket [i]= randomNumber;}
        return ticket;
    }
    public static boolean search(int[] ticket, int randomNumber){
        for (int i:ticket){
            if (i==randomNumber) {return true;}}return false;}

    public static void printTicket(int ticket[]){
        for (int i=0; i<LENGTH; i++){
            System.out.print(ticket[i]+ " | ");
        }
    }
}
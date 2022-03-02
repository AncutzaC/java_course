package chapter13;

/*
-creates 2 players
-asks player 1 to choose Heads or Tails
-ensures that player 1 guess is valid
-automatically assigns player 2 guess to the opposite of what player 1 choose
-flips the coin
-determines winner based on what coin landed on
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CoinTossGame {
    Scanner scanner = new Scanner(System.in);
    public static void main (String args[]){
        CoinTossGame coinToss = new CoinTossGame();
        String player1= coinToss.createsPlayer1();
        String player2= coinToss.createsPlayer2();
        String guessPlayer1 = coinToss.askPlayer1toGuess(player1);
        String guessPlayer1final = coinToss.ensuresPlayer1guessIsValid(guessPlayer1);
        String flipCoin = flipCoin();
        System.out.println("Moneda a fost aruncata! Aceasta a cazut cu "+ flipCoin + " in sus");
        System.out.println("Castigatorul/Castigatoarea este " + coinToss.determinesWinner(guessPlayer1final,flipCoin,player1,player2));
    }

    public String createsPlayer1(){
        System.out.print("Introdu numele primului jucator: ");
        String player1 = scanner.next();
        return player1;}
    public String createsPlayer2(){
        System.out.print("Introdu numele celui de-al doilea jucator: ");
        String player2 = scanner.next();
        return player2;}

    public String askPlayer1toGuess(String player1){
        System.out.print(player1 + " ghiceste pe ce parte va cadea moneda - Cap sau Pajura:");
    return scanner.next();}

    public String ensuresPlayer1guessIsValid (String guessPlayer1){
        while (true) {
            if (guessPlayer1.toUpperCase().matches("CAP") || guessPlayer1.toUpperCase().matches("PAJURA")) {
                String guessPlayer1final = guessPlayer1;
                return guessPlayer1final;
            }
            else {
                System.out.print("Probabil eroare de tastare, reincearca te rog! :");
                guessPlayer1 = scanner.next();
            }
        }
    }

    public static String flipCoin(){
        List sides = new ArrayList();
        sides.add("Cap");
        sides.add("Pajura");
        Random randomizer = new Random();
        Object sides1= sides.get(randomizer.nextInt(sides.size()));
        String side =sides1.toString();
        return side;}

    public String determinesWinner (String guessPlayer1final, String flipCoin, String player1, String player2 ){
        String winner;
            if (guessPlayer1final.matches(flipCoin)){
            winner = player1;
        } else {winner= player2;}
    return winner;}
}

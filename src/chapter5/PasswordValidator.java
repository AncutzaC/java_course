package chapter5;

/* at least 8 characters long, contains an uppercase letter, special character, not contain the username
* not the same as the old password*/

import java.util.Scanner;

public class PasswordValidator {
    private static String username;
    private static String oldPassword;
    private static String newPassword;

    public static void main(String args[]) {
        printPassWordRules();
       // insertUsername();
       // insertOldPassword();
       // insertNewPassword();

        validatePassword();
    }
    private static Scanner sc = new Scanner(System.in);
    public static void printPassWordRules(){
        System.out.println("Your new password must be:");
        System.out.println("  - at least 8 characters long");
        System.out.println("  - needs to contain an uppercase letter");
        System.out.println("  - needs to contain a special character");
        System.out.println("  - does not need to contain the username");
        System.out.println("  - does not need to contain the last password");}
    public static String insertUsername(){
        System.out.print("Insert username:");
        String username = sc.nextLine();
        return username;}
    public static String insertOldPassword (){
        System.out.print("Insert old password:");
        String oldPassword = sc.nextLine();
        return oldPassword;}
    public static String insertNewPassword(){
        System.out.print("Insert your new password:");
        String newPassword = sc.nextLine();
        return newPassword;}

    public static boolean validatePassword(){
        boolean valide = true;
        oldPassword = insertOldPassword();
        username = insertUsername();
        newPassword = insertNewPassword();
        while (valide){
        if(newPassword.length() > 8){valide = true;}
            else {valide = false;
                System.out.println("Your password is not long enough!");
            }
        if (valide= true){
                for (int i=0; i<newPassword.length(); i++){
                    valide = Character.isUpperCase(newPassword.charAt(i));
                }
                if (valide = false){
                    System.out.println("Your password does not contain an uppercase word!");
                }
        }
        if (valide){
                for (int i=0; i<newPassword.length(); i++){
                if (Character.isUpperCase(newPassword.charAt(i)) || Character.isLowerCase(newPassword.charAt(i)))
                {valide = false;
                }
                }
                if (valide = false){
                    System.out.println ("Your password does not contain a special character!");}}
        if (valide){for (int i=0; i<newPassword.length(); i++){
                if (newPassword.matches(username)) {valide= false;System.out.println("Your password contains" +
                        " your username!");}}}
        if (valide){
            for (int i=0; i<newPassword.length(); i++){
                if (newPassword.matches(oldPassword))
                {valide = false;}
            }
            if (valide= false){
                System.out.println("Your password contains your last one!");}
        }
        if (valide){
            System.out.println("Your new password is strong!");}
        }return valide;}
}


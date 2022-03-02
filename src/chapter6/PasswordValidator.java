package chapter6;

import java.util.Scanner;

public class PasswordValidator {
    private String username;
    private String oldpassword;
    private String newpassword;

    Scanner scanner = new Scanner(System.in);

    public PasswordValidator() {
        this.username = username;
        this.oldpassword = oldpassword;
        this.newpassword = newpassword;
        System.out.print("Username:");
        username = scanner.nextLine();
        System.out.print("Old Password:");
        oldpassword = scanner.nextLine();
        System.out.print("New Password:");
        newpassword = scanner.nextLine();
    }

    public static void main(String args[]) {
        PasswordValidator validator = new PasswordValidator();
        boolean valid = true;
        String error = "parola buna";
        do {
            if (validator.newpassword.length() < 9) {
                valid = false;
                error = "pass to short";
            }
            if (validator.newpassword.contains(validator.username.toLowerCase())) {
                valid = false;
                error = "nu poate sa contina username-ul";
            }
            if (validator.newpassword.matches("[a-zA-Z0-9]*")){
                valid = false;
                error = "tre sa aiba caracter special";
            }
            if (validator.newpassword.toUpperCase().contains(validator.oldpassword.toUpperCase())){
                valid=false;
                error= "nu tre sa contina vechea parola";
            }
            valid= false;}
        while (valid);
            System.out.println(error);
    }
}
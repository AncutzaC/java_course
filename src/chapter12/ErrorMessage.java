package chapter12;

// When you execute this, you'll see an exception, so I want you to update that program to handle the exception.
//
//Then print a statement after the division to say, "Division is fun." This statement should be outputted no
// matter what happens in your program.//


public class ErrorMessage {
    public static void main (String args[]){
        catchErrorMessage();
    }
    public static void catchErrorMessage(){
        try {int c =30/0;
    } catch (ArithmeticException e){
            System.out.println("Division by 0 is not permitted.");
        } finally {
            System.out.println("Division is fun.");
        }
        }
}

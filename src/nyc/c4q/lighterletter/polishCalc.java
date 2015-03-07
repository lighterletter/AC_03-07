package nyc.c4q.lighterletter;

/**
 * C4Q John Gomez 3-7-15
 * Polish calculator, help by Hoshiko Oki
 * Program asks the user for two integers and outputs a solution based on the operator provided by the user.
 */
import java.util.Scanner;
public class polishCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Please enter your first number:");
        int num1 = input.nextInt();

        System.out.println("Please enter your second number:");
        int num2 = input.nextInt();

        System.out.println("Please enter an operator:");

        String opEr = input.next();
        if (opEr.equals("+")) {
            System.out.println(num1+num2);
        } else if (opEr.equals("-")) {
            System.out.println(num1-num2);
        } else if (opEr.equals("/")) {
            System.out.println(num1/num2);
        } else if (opEr.equals("*")) {
            System.out.println(num1*num2);
        } else if (opEr.equals("%")) {
            System.out.println(num1%num2);
        } else {
            System.out.println("Invalid operation.");
        }


    }

}

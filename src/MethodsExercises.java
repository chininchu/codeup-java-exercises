import java.util.Scanner;

public class MethodsExercises {


    public static void main(String[] args) {

        System.out.println(Addition(3, 4));
        System.out.println(Subtract(5, 9));
        System.out.println(Multiply(4, 8));
        System.out.println(Division(12, 2));
        System.out.println(MoD(12, 2));
        System.out.println(getInteger(1, 10));
        System.out.println(Factorial());
        System.out.println(dice());


        //    Basic Arithmetic
//
//          Create four separate methods. Each will perform an arithmetic operation:
//
//              Addition
//              Subtraction
//              Multiplication
//              Division
//    Each function needs to take two parameters/arguments so that the operation can be performed.
//
//    Test your methods and verify the output.
//
//    Add a modulus method that finds the modulus of two numbers.
//
//    Food for thought: What happens if we try to divide by zero? What should happen?


    }

    public static long Addition(long para1, long para2) {

        return para1 + para2;

    }


    public static long Subtract(long para1, long para2) {

        return para1 - para2;

    }

    public static long Multiply(long para1, long para2) {

        return para1 * para2;

    }

    public static long Division(long para1, long para2) {

        return para1 / para2;

    }


    public static long MoD(long para1, long para2) {

        return para1 % para2;

    }

    // A division by zero will cause Java to print an ArithmeticException


//    Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
//
//    The method signature should look like this:
//
//
//    public static int getInteger(int min, int max);
//    and is used like this:
//
//
//            System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);
//    If the input is invalid, prompt the user again.


    public static long getInteger(int min, int max) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number between 1 and 10: ");

        int UserInput = scan.nextInt();

        if (UserInput >= min && UserInput <= max) {

            return UserInput;


        }

        System.out.println("Invalid Number");

        return getInteger(min, max);


    }

//    Calculate the factorial of a number.

//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:


    public static boolean UserContinue() {

        System.out.println("Would you like to continue [y/n]?");
        Scanner scan = new Scanner(System.in);
        String UserInput = scan.nextLine();

        if (UserInput.equalsIgnoreCase("y")) {

            return true;

        } else {

            return false;
        }
    }


    public static long Factorial() {


        long userFactorial = getInteger(1, 10);

        System.out.println(userFactorial);

        boolean UserChoice = UserContinue();

        if (UserChoice) {

            long count = 1;
            for (long i = 1; i < userFactorial; i++) {

                count *= i;
                System.out.println(count);
            }
            Factorial();
        }

        return userFactorial;
    }


//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//   "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//    Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.

    public static String dice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many side does your dice have?");
        int UserInput = scan.nextInt();
        int dice1 = (int) ((Math.random() * UserInput) + 1);
        int dice2 = (int) ((Math.random() * UserInput) + 1);
        return "dice #1 " + dice1 + " " + "dice #2" + " " + dice2;


    }


}












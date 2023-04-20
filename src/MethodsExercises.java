import java.util.Scanner;

public class MethodsExercises {


    public static void main(String[] args) {

        System.out.println(Addition(3, 4));
        System.out.println(Subtract(5, 9));
        System.out.println(Multiply(4, 8));
        System.out.println(Division(12, 2));
        System.out.println(MoD(12, 2));
        System.out.println(getInteger(1, 10));
        System.out.println(Factorial(20));


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

    public static int Factorial() {

        long userFactorial = getInteger(1, 10);

        return Factorial();


    }


}






public class MethodsExercises {


    public static void main(String[] args) {

        System.out.println(Addition(3, 4));
        System.out.println(Subtract(5, 9));
        System.out.println(Multiply(4, 8));
        System.out.println(Division(12, 2));
        System.out.println(MoD(12, 0));


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


// Bonus


}






import java.util.Scanner;

public class HighLow {

    //    Game Development 101
//
//    Welcome to the world of game development!
//
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"'

    public static void main(String[] args) {

        System.out.println(HighLow(1, 100));


    }


    public static String HighLow(int min, int max) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number");

        int UserInput = scan.nextInt();

        min = (int) Math.ceil(min);
        max = (int) Math.floor(max);


        if (UserInput < Math.random() * (max - min) + min) {

            System.out.println("HIGHER");


        } else if (UserInput > Math.random() * (max - min) + min) {

            System.out.println("LOWER");


        } else {

            System.out.println("GOOD GUESS");
        }


        return " ";


    }


}

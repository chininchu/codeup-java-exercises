import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class ConsoleExercises {

    public static void main (String[] args){

//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is %s.%n", pi);
//
        Scanner scan = new Scanner(System.in);

//        System.out.print("Enter a number:");
//
//        // The user enters an integer
//
//        int userInput = scan.nextInt();
//
//        System.out.printf("You entered %s.%n",userInput);
//
//
//        // User is prompted to enter 3 words
//
//        System.out.println("Enter three words:");
//
////        String Word1 = scan.next();
////        String Word2 = scan.next();
////        String Word3 = scan.next();
////
////
////        System.out.println(Word1);
////        System.out.println(Word2);
////        System.out.println(Word3);
//
//        //Using the Nextline method to display words
//
//        String Word1a = scan.nextLine();
//        String Word2b = scan.nextLine();
//        String Word3c = scan.nextLine();
//
//
//
//        System.out.println(Word1a);
//        System.out.println(Word2b);
//        System.out.println(Word3c);

        // User enter's the length

        System.out.println("What is the classroom's length:");


         String Length = scan.nextLine();

        System.out.println("What is the classroom's Width:");

        String Width = scan.nextLine();

        // Calculates the Area of the Rectangle

         int AreaOfRectangle = parseInt(Length) * parseInt(Width);
//
        System.out.printf("The Area of the Rectangle is %s.%n",AreaOfRectangle);

        // Calculates the Perimeter of the Rectangle

        int PerimeterOfRectangle = (2 * parseInt(Length)) + (2 *parseInt(Width));

        System.out.printf("The perimeter of the Rectangle is %s",PerimeterOfRectangle);













































    }
}



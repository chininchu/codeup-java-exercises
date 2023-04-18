import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {


//        1. Loop Basics
//
//        a. While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15


//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
//
//        b. Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int i = 2;
//
//        do {
//
//            System.out.println(i);
//            i += 2;
//
//        } while (i <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//
//        do {
//
//            System.out.println(i);
//            i -= 5;
//
//        } while (i >= -10);


//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//        long i = 2;
//
//        do {
//
//
//            System.out.println(i);
//            i *= i;
//
//
//        } while (i < 1000000);


//
//        2
//        4
//        16
//        256
//        65536


//
//
//        c. For
//
//        Refactor the previous two exercises to use a for loop instead.

//        for(long i = 5; i <= 15; i ++) {
//            System.out.println("i is " + i);
//        }


//        for(long i = 2; i <= 100; i+=2) {
//            System.out.println("i is " + i);
//        }

//        for(long i = 100; i >= -10; i-=5) {
//            System.out.println("i is " + i);
//        }

//        for(long i = 2; i < 1000000; i*= i) {
//            System.out.println("i is " + i);
//        }


//        2. Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        for(int i = 1; i <= 100; i ++) {
//            System.out.println("i is " + i);
//        }

//        For multiples of three: print “Fizz” instead of the number.

//        for(int i = 1; i <= 100; i++) {
//
//
//            if(i % 3 == 0){
//
//                System.out.printf("Fizz%n");
//                continue;
//            }
//
//            System.out.println(i);
//
//
//        }

        //        For the multiples of five: print “Buzz”.


//        for(int i = 1; i <= 100; i++) {
//
//
//            if(i % 5 == 0){
//
//                System.out.printf("Buzz%n");
//                continue;
//            }
//
//            System.out.println(i);
//
//
//        }

//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for (int i = 1; i <= 100; i++) {
//
//
//            if (i % 3 == 0 || i % 5 == 0) {
//
//                System.out.printf("FIzzBuzz%n");
//                continue;
//            }
//
//            System.out.println(i);
//
//
//        }

//Display a table of powers.

//Prompt the user to enter an integer.
//Display a table of squares and cubes from 1 to the value entered.
//Ask if the user wants to continue.
//Assume that the user will enter valid data.
//Only continue if the user agrees to.

        Scanner sc = new Scanner(System.in);

//        boolean confirm;
//
//        do {
//            System.out.println("Enter a integer: ");
//            int userInt = sc.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//
//            for (int i = 1; i <= userInt; i++) {
//                int square = i * i;
//                int cubed = i * i * i;
//
//                System.out.printf("%7s|%9s|%6s %n", i, square, cubed);
//            }
//
//            System.out.print("Continue? [y/n]");
//            confirm = sc.next().equalsIgnoreCase("y");
//
//        } while (confirm);
//        System.out.println("See you next time");


//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//                Display the corresponding letter grade.
//                Prompt the user to continue.
//                Assume that the user will enter valid integers for the grades.
//                The application should only continue if the user agrees to.
//                  Grade Ranges:
//
//                   A : 100 - 88
//                   B : 87 - 80
//                   C : 79 - 67
//                   D : 66 - 60
//                   F : 59 - 0


        boolean confirm;


        do {
            System.out.println("Enter a numerical grade: ");
            int userGrade = sc.nextInt();

            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.print("Continue? [y/n]");
            confirm = sc.next().equalsIgnoreCase("y");


        } while (confirm);
        System.out.println("Ok bye !");


    }
}


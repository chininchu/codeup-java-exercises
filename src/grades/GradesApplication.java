package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class GradesApplication {


    public static void main(String[] args) {


        Student student1 = new Student("John");
        Student student2 = new Student("Abby");
        Student student3 = new Student("peter");

        student1.addGrade(20);
        student2.addGrade(40);
        student3.addGrade(60);


        // A hashMap that will usernames as a key and Student Objects as values


        HashMap<String, String> students = new HashMap<>();

        students.put("John.student1@github.com", student1.getName() + student1.getGradeAverage());

        students.put("Abby.student2@github.com", student2.getName() + student2.getGradeAverage());

        students.put("peter.student3@github.com", student2.getName() + student2.getGradeAverage());


        // Displays thr Welcome message


        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:\n");


        String key = " ";

        // The forLoop prints the usernames for the students


        for (Map.Entry<String, String> entry : students.entrySet()) {

            key = "|" + entry.getKey() + "|" + " ";
            System.out.printf(key);


        }

        System.out.println("\nWhat student would you like to see more information on?");


        // Scanner class allows the user to enter a username in the form of a string


        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();


        // The forLoop check the userInput against the HashMap


        for (Map.Entry<String, String> entry : students.entrySet()) {


            key = "|" + entry.getKey() + "|" + " ";

            String keyMatch = String.valueOf(userInput.equalsIgnoreCase(entry.getKey()));


        }

        System.out.println("Passed");


    }


}


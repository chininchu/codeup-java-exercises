package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class GradesApplication {

    public static void main(String[] args) {


        Student Student1 = new Student("Student1");
        Student Student2 = new Student("Student2");
        Student Student3 = new Student("Student3");
        Student Student4 = new Student("Student4");


        Student1.addGrade(30);
        Student2.addGrade(40);
        Student3.addGrade(50);
        Student4.addGrade(60);


        HashMap<String, String> students = new HashMap<>();


        students.put("Student1@github.com" + " ", " " + Student1.getName() + " " + Student1.getGradeAverage());

        students.put("Student2@github.com" + " ", " " + Student2.getName() + " " + Student2.getGradeAverage());

        students.put("Student3@github.com" + " ", " " + Student3.getName() + " " + Student3.getGradeAverage());

        students.put("Student4@github.com" + " ", " " + Student4.getName() + " " + Student4.getGradeAverage());





        System.out.println("Welcome" + "\n" + "Here are the GitHub usernames of our students:\n");

            for (Map.Entry<String, String> entry : students.entrySet()) {

                System.out.print("|" + entry.getKey() + "|" + " ");








            }


        System.out.println("\n What student would you like to see more information on?");

        Scanner sc = new Scanner(System.in);

        String userInput = sc.next();


























//        System.out.println("\n" + "What student would you like to see more information on?\n");
//
//        Scanner sc = new Scanner(System.in);
//
//        String userInput = sc.next();
//
//        if (userInput.equalsIgnoreCase(entry.getKey())) {
//
//            System.out.printf(entry.getValue());
//
//
//        }


    }

}


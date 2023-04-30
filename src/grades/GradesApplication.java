package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("John");
        Student student2 = new Student("Abby");
        Student student3 = new Student("peter");

        student1.addGrade(20);
        student2.addGrade(40);
        student3.addGrade(60);


        student1.getGradeAverage();
        student2.getGradeAverage();
        student3.getGradeAverage();

        students.put();



















    }

}


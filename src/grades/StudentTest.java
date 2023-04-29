package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student("Andrew");
        student1.addGrade(30);
        student1.addGrade(20);
        student1.addGrade(10);
        System.out.println(student1.getGradeAverage());




    }
}

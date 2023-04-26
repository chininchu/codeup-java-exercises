import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person [3];
        people[0] = new Person("Nikki");
        people[1] = new Person("Johnny");
        people[2] = new Person("Farrukh");

        Person savanna = new Person("savanna");
        people = addPerson(people, savanna);

        for(Person person : people){
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson(Person[] array, Person newPerson){
        Person[] people = Arrays.copyOf(array, array.length +1);
        people[people.length-1] = newPerson;
        return people;
    }
}
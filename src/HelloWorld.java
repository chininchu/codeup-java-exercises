public class HelloWorld {
    public static void main(String[] args) {

        System.out.print("Hello,World!");
        System.out.print("Hello, World!");
        System.out.println("Hello New World!");
        System.out.println("Hello New World!");
//        System.out.print("Hello, World!");


//        Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

        int myFavoriteNumber = 10;

        System.out.println(myFavoriteNumber);


//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.

        String myString = "My Name is Andrew";
        System.out.println(myString);


//        Change your code to assign a character value to myString. What do you notice?

        // Produces an error message


//        Change your code to assign the value 3.14159 to myString. What happens?

        // java: incompatible types: double cannot be converted to java.lang.String


//        Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

        // java: illegal start of expression


//        Change your code to assign the value 3.14 to myNumber. What do you notice?

        //java: incompatible types: double cannot be converted to java.lang.String


//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

        // java: incompatible types: double cannot be converted to java.lang.String


//        Change your code to assign the value 123 to myNumber.

        long myNumber = 123;
        System.out.println(myNumber);


//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

        // The long data type is not designed to intake decimal values


//        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

//        We can change the data type of float to double.
//        Use a cast to convert the returned double to a float.


//        Copy and paste the following code blocks one at a time and execute them


//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);


//        What is the difference between the above code blocks? Explain why the code outputs what it does.

        // The first code of block is running a post-increment operation, where the system prints the original assignment and then the post-incremented value. The second code black executes a pre-increment operation.


//        Try to create a variable named class. What happens?

        // java: <identifier> expected


//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?


//        String theNumberThree = "three";
//        System.out.println(theNumberThree);
//        Object o = theNumberThree;
//        System.out.println(theNumberThree);
//        int three = (int) o;
//        System.out.println(three);


//        Copy and paste the code above and then run it. Does the result match with your expectation?

        // The first block of code meets my expectations


//        How is the above example different from the code block below?


//        int three = (int) "three";

        // Object is not a keyword, it is a data type


//        What are the two different types of errors we are observing?



//        Rewrite the following expressions using the relevant shorthand assignment operators:


//        int x = 4;
//        x = x + 5;
//        x += 5;
//        System.out.println(x);


//        int x = 3;
//        int y = 4;
//      y = y * x;
//        y *= x;
//        System.out.println(y);
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        System.out.println(x);
//        x = x / y;
//        y = y - x;
//        y -= x;
//        System.out.println(y);


//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?


//      This will cause an integer overflow error.


//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.


    }
}

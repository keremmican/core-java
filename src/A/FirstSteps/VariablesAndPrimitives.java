package A.FirstSteps;

/*author @keremmican*/

public class VariablesAndPrimitives {
    public static void main(String[] args) {

        System.out.println("Hello World!");   /*--This helps us to print and see the thing
                                                  we wrote in parentheses--*/

        /*--Variables--*/

        /*--Variables are used to store data in memory--*/
        /*--You can initialize the variables using primitive or reference type--*/

        int number = 5;     /*--This called "statement" (or "declaration").
                                Right side of the statement is called expression--*/

        System.out.println(number);

        int number2 = 10;
        int number3 = 11;

        /*--You can also print different types of data in the same line--*/
        System.out.println("Number: " + number2 + number3);

        /*--operators in java:
            + -> to add variables
            - -> to subtract variables
            * -> to multiply variables
            / -> to divide variables
            % -> to modulus variables
            ++ -> to increment variables
            -- -> to decrement variables
        --*/

        number = number * number2 + number3;

        System.out.println(number);

        /*--Primitives--*/

        /*--Primitive data types are simply placeholders in memory
        for a value.--*/

        /*--Here are eight primitive data types in Java
            1. boolean
            2. char
            3. byte
            4. short
            5. int
            6. long
            7. float
            8. double
        --*/

        /*--int--*/
        int maxInteger = Integer.MAX_VALUE;
        int minInteger = Integer.MIN_VALUE;

        System.out.println("Max Integer value: " + maxInteger + " Min Integer Value: " + minInteger);

        /*--If you exceed the max or the min value, it will cause an overflow,
        which means it cannot be stored in the memory--*/

        System.out.println("Max value overflow: " + (maxInteger + 1)); /*--This become negative because
                                                                           of the overflow.--*/

        /*---Overflow -> When trying to put a value larger than the maximum,
        memory tries to fit it instead of throwing an error.

        Underflow -> Vice versa. Happens when you try to put a value smaller
        than the minimum.-*/

        /*--What is int and Integer? Are they the same?
            In some way yes.
            +int is a primitive data type that gives us the option to set the
            variables value.
            +On the other hand, Integer is what's called a wrapper class. It has its own
            functions and attributes.
        --*/

        /*--Classes
        A class is a building block for OOP and
        allows us to build custom data types.--*/

        /*--Wrapper Class
        Provides simple operations and some basic information about the
        primitive data type, which cannot be stored on the primitive itself.
        --*/

        /*-- The primitives and their respective wrapper classes:
        byte -> Byte
        short -> Short
        char -> Character
        int -> Integer
        long -> Long
        float -> Float
        double -> Double
        boolean -> Boolean
        --*/


    }
}

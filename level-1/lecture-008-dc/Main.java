import java.util.Scanner;

public class Main {

    public static void printHello() {
        System.out.println("Hello pepcoder");
        System.out.println("This is a new line!"); // This is a new line!
        System.out.print("Milind Mishra!");
    }

    public static void printHundred() {
        for (int i = 0; i < 100; i++) { // iterative statements : loops
            System.out.println(i + 1);
        }
    }

    /*
     * Data Types (user defined : with classes (String) , primitive : with data
     * types (int, double, boolean, char, etc.)):
     * byte, short, int, long, float, double, char, boolean
     * int : 32 bit (age, numbers, etc)
     * long : 64 bit (distance, time, etc)
     * float : 32 bit (temperature, etc)
     * double : 64 bit (price, etc)
     * char : 16 bit (2 bytes) (a single character)
     * boolean : true or false (true or false type variables, high low)
     * byte : 8 bit (1 byte)
     * short : 16 bit (2 bytes)
     */

    /*
     * Variables :
     * 1. Variable name must start with a letter or an underscore
     * 2. Variable name can contain numbers, but not at the beginning
     * 3. Variable names are case sensitive
     * basket which can store values depending on the type of data
     * Declaration of a variable :
     * 1. Data type
     * 2. Variable name
     * 3. Initial value
     * 4. Data type can be inferred from the initial value
     * 5. Variable name can be inferred from the initial value
     * int age = 30;
     * String name = "Milind";
     */

    public static void printAge() {
        int age = 21;
        System.out.println("Milind's age is " + age);
    }

    public static void printZ() {
        System.out.println("*****");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("*****");

    }

    /*
     * conditionals
     * if, else if, else
     * if (condition) {
     * // code to be executed if condition is true
     * } else if (condition) {
     * // code to be executed if condition is true
     * } else {
     * // code to be executed if condition is false
     * }
     * == : equal to
     * != : not equal to
     * < : less than
     * > : greater than
     * <= : less than or equal to
     * >= : greater than or equal to
     * && : and
     * || : or
     * ! : not
     */

    public static void ageCheck() {
        int age = 50; // value of age assigned to variable named age
        int myFriendAge = 21; // value of myFriendAge assigned to variable named myFriendAge
        if (age < 18) { // condition 1
            System.out.println("You are a minor");
        } else if (age < 21) { // condition 2
            System.out.println("You are a teenager");
        } else if (age < 30) { // condition 3
            System.out.println("You are a young adult");
        } else if (age < 40) { // condition 4
            System.out.println("You are a adult");
        } else if (age < 50) { // condition 5
            System.out.println("You are a middle aged");
        } else if (age < 60) { // condition 6
            System.out.println("You are a old");
        } else { // else automatic condition which are excluded from all if, else if conditions
            System.out.println("You are a senior");
        }
        // application of == operator
        if (age == myFriendAge) {
            System.out.println("You and your friend are of the same age");
        } else if (age > myFriendAge) {
            System.out.println("You are older than your friend");
        } else {
            System.out.println("You are younger than your friend");
        }
    }

    // Ternary Operator :
    // condition ? true : false
    public static void ageCheckTernary() {
        int age = 50;
        String message = (age < 18) ? "You are a minor" : "You are a senior";
        System.out.println(message);
    }

    // Taking input from user :
    // Scanner Class :
    // Scanner class is used to take input from the user

    public static void userInput() {
        Scanner sc = new Scanner(System.in); // making object 'sc' of Scanner class
        System.out.println("Enter your name : ");
        String name = sc.nextLine(); // taking string input from Scanner

        // .next() : (string input) used to take input from the user util given space
        // .nextLine() : used to take input from the user util given new line

        System.out.println("Enter your age : ");
        int age = sc.nextInt(); // taking integer input from Scanner

        // .nextInt() : used to take integer input from Scanner util given space or new
        // line

        System.out.println("Enter your height : ");
        double height = sc.nextDouble(); // taking double input from Scanner

        // .nextDouble() : used to take double input from Scanner util given space or
        // new line

        System.out.println("Enter your weight : ");
        double weight = sc.nextDouble(); // taking double input from Scanner
        System.out.println(
                "Hi, " + name + "! You are " + age + " years old, " + height + " cm tall and " + weight + " kg heavy.");
        sc.close();
    }

    public static void loopsDemo() {
        // types of loops : for, while, do while
        // entry controlled loops : for, while
        // exit controlled loops : do while

        // for loop :
        // for (initialization; condition; increment/decrement) {
        // // code to be executed
        // }
        // initialization : used to initialize the value of the variable
        // condition : used to check the condition
        // increment/decrement : used to increment/decrement the value of the variable
        // for loop is used to iterate over a block of code a specified number of times

        // while loop :
        // while (condition) {
        // // code to be executed
        // }
        // while loop is used to iterate over a block of code while a specified
        // condition is true

        // do while loop :
        // do {
        // // code to be executed
        // } while (condition);
        // do while loop is used to iterate over a block of code at least once
        // while a specified condition is true

        // for loop :
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }

    }

    public static void main(String[] args) {
        userInput();
        sc.close();
    }
}
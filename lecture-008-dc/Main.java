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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printZ();
        sc.close();
    }
}
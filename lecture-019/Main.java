import java.io.*;
import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void diagonalTraversal(int[][] arr) {
        // Gap Strategy: gap = (j - i)
        // gap decides the number of diagonals to be traversed
        // 1. Find the length of the array
        // 2. Iterate through the array, starting at the top left corner
        // 3. Print the value at each position
        // *. diagonal traversal logic is : i++ and j++
        // 4. Move to the next position in the array
        // 5. Repeat until the end of the array is reached
        for (int gap = 0; gap < arr.length; gap++) {
            for (int i = 0, j = gap; j < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void saddlePoint(int[][] arr) {
        // 1. Iterate through the array
        // 2. Find the minimum value in the row
        // 3. Find the maximum value in the column
        // 4. If the minimum value in the row is greater than the maximum value in the
        // column, print the row and column
        for (int i = 0; i < arr.length; i++) { // row
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < arr[i].length; j++) { // column
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            // complete (home-work)
        }

    }

    // String Theory :
    // 1. String is a class
    // 2. String is an object
    // 3. String is a primitive data type
    // 4. String is a wrapper class for the primitive data type
    // 5. String is a sequence of characters
    // 6. String is immutable
    // Initialisation :
    // 1. String s = "Hello World"
    // 2. String s = new String("Hello World")
    // Member Functions :
    // 1. s.charAt(0) // spits out the character at index 0
    // 2. s.length() // returns the length of the string
    // 3. s.substring(0, 5) // returns the substring from index 0 to index 4
    // 4. s.toUpperCase() // returns the string in upper case
    // 5. s.toLowerCase() // returns the string in lower case
    // 6. s.equals("Hello World") // returns true if the string is equal to the
    // string passed in
    // 7. s.equalsIgnoreCase("Hello World") // returns true if the string is equal
    // to the string passed in, ignoring case
    // 8. s.contains("Hello") // returns true if the string contains the string
    // passed in
    // 9. s.indexOf("Hello") // returns the index of the first occurrence of the
    // string passed in
    // 10. s.lastIndexOf("Hello") // returns the index of the last occurrence of the
    // string passed in
    // 11. s.replace("Hello", "Goodbye") // replaces all occurrences of the string
    // passed in with the string passed in
    // 12. s.split(" ") // splits the string into an array of strings, based on the
    // string passed in
    // 13. s.trim() // removes all whitespace from the beginning and end of the
    // string
    // 14. s.toCharArray() // returns an array of characters
    // 15. s.compareTo("Hello World") // returns 0 if the string is equal to the
    // string passed in, -1 if the string is less than the string passed in, and 1
    // if the string is greater than the string passed in
    // 16. s.compareToIgnoreCase("Hello World") // returns 0 if the string is equal
    // to the string passed in, -1 if the string is less than the string passed in,
    // and 1 if the string is greater than the string passed in, ignoring case
    // 17. s.startsWith("Hello") // returns true if the string starts with the
    // string passed in
    // 18. s.endsWith("Hello") // returns true if the string ends with the string
    // passed in
    // Taking Input :
    // 1. Scanner sc = new Scanner(System.in)
    // 2. String s = sc.nextLine() // takes in a string until the user hits enter
    // 3. String s2 = sc.next() // takes in a string until the user hits space
    // String Output :
    // 1. System.out.println(s)
    // 2. System.out.println(s.length())
    // 3. System.out.println(s.substring(0, 5))
    // 4. System.out.println(s.toUpperCase())
    // 5. System.out.println(s.toLowerCase())
    // 6. System.out.println(s.equals("Hello World"))
    // 7. System.out.println(s.equalsIgnoreCase("Hello World"))
    // 8. System.out.println(s.contains("Hello"))
    // 9. System.out.println(s.indexOf("Hello"))
    // 10. System.out.println(s.lastIndexOf("Hello"))
    // 11. System.out.println(s.replace("Hello", "Goodbye"))
    // 12. System.out.println(s.split(" "))
    // 13. System.out.println(s.trim())
    // 14. System.out.println(s.toCharArray())
    // 15. System.out.println(s.compareTo("Hello World"))
    // 16. System.out.println(s.compareToIgnoreCase("Hello World"))
    // 17. System.out.println(s.startsWith("Hello"))
    // 18. System.out.println(s.endsWith("Hello"))

    public static void stringDemo() {
        String s = "milind";
        System.out.println(s);
        System.out.println(s.length());
        char ch = s.charAt(0);
        System.out.println(ch);
        // concatenation :
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2; // adding two strings
        System.out.println(s3);
        String s4 = s1.concat(s2); // concatenation using the concat method
        System.out.println(s4);

        // taking a char input :
        // char ch1 = sc.next().charAt(0);
        // System.out.println(ch1); // prints the first character of the string

        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        if (a == c) { // == is used to compare the references (address)
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        if (a.equals(c)) { // check character by character (checks content)
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        // NOTE :
        // c = b // this assigns value of b in c from same address of b in heap
        // a = a + b // this assigns value of a + b in a in a new address in heap
        // since adding in same address is not allowed also costly in memory
        // old address gets inaccesable and gets collected by garbage collector

        // substring :
        String s5 = "Hello World";
        String s6 = s5.substring(0, 5); // substring from index 0 to index 4
        // Note : substring gets created at a new memory address and gets assigned to s6
        String s7 = s5.substring(5); // substring from index 5 to end
        // Note : substring gets created at a new memory address and gets assigned to s7
        System.out.println(s6); // prints Hello
        System.out.println(s7); // prints World
    }

    public static void main(String[] args) throws Exception {
        // int n = sc.nextInt();
        // int[][] arr = new int[n][n];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // diagonalTraversal(arr);
        stringDemo();
    }
}
import java.util.*;
public class DigitsOfaNumber {
    public static void main(String[] args) {
      // write your code here
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
        // Converting the integer input to string data
        String string_number = Integer.toString(number);
        // Traversing through the string using for loop
        for (int i = 0; i < string_number.length(); i++) {
            // Printing the characters at each position
            System.out.println(string_number.charAt(i));
        }
     }
}

import java.util.*;

// print if given tripplet is a pythagorean triplet
public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        isPythagoreanTriplets(a, b, c);
        sc.close();
    }

    public static void isPythagoreanTriplets(int a, int b, int c) {
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("true");
        } else {
            System.out.println("flase");
        }
    }

}

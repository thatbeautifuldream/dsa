import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInReverse(n);
        sc.close();
    }

    public static void printInReverse(int num) {
        while (num != 0) {
            System.out.print(num % 10);
            num /= 10;
        }
    }
}

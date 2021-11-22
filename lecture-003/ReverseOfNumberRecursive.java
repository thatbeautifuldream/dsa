import java.util.Scanner;

// recursively print reverse of number given
public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInReverse(n);
        sc.close();
    }

    public static void printInReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n % 10);
        printInReverse(n / 10);
    }
}

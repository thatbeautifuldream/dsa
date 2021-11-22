import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInReverse(n);
        sc.close();
    }

    public static int printInReverse(int num) {
        int lastIndex = 1, res = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            num /= 10;
            res += lastIndex * (int) Math.pow(10, lastDigit - 1);
            lastIndex++;
        }
        return res;
    }
}

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = printInverse(n);
        System.out.println(ans);
        sc.close();
    }

    public static int printInverse(int num) {
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

import java.util.Scanner;

public class RotateByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        rotateNumber(n, k);
    }

    

    public static int rotateNumber(int n, int k) {
        int len = countDigits(n);
        k = (k % len + len) % len;
        int div = 1, mul = 1;
        for (int i = 1; i <= k; i++) {
            div *= 10;
        }
        for (int i = 1; i <= len - k; i++) {
            mul *= 10;
        }
        int a = n / div;
        int b = n % div;
        return (b * mul + a);

    }
}

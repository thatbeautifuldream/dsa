import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = binaryToDecimal(n);
        System.out.println(ans);
        sc.close();
    }

    public static int decimalToBinary(int n) {
        int ans = 0, pow = 1;
        while (n != 0) {
            int r = n % 2;
            n /= 2;
            ans += (r * pow);
            pow *= 10;
        }
        return ans;
    }

    public static int binaryToDecimal(int n) {
        int ans = 0, pow = 1;
        while (n != 0) {
            int r = n % 10;
            n /= 10;
            ans += (r * pow);
            pow *= 2;
        }
        return ans;
    }

}

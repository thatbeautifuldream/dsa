import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = decimalAddition(sc.nextInt(), sc.nextInt());
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

    // base ranges from 2 to 10
    public static int decimalToAnyBase(int n, int b) {
        int ans = 0, pow = 1;
        while (n != 0) {
            int r = n % b;
            n /= b;
            ans += (r * pow);
            pow *= 10;
        }
        return ans;
    }

    public static int anyBaseToDecimal(int n, int b) {
        int ans = 0, pow = 1;
        while (n != 0) {
            int r = n % 10;
            n /= 10;
            ans += (r * pow);
            pow *= b;
        }
        return ans;
    }

    public static int anyBaseToAnyBase(int n, int b1, int b2) {
        int ab2d = anyBaseToDecimal(n, b2);
        int ans = decimalToAnyBase(ab2d, b1);
        return ans;
    }

    // public static int decimalAddition(int num1, int num2) {
    // int ans = 0, carry = 0;
    // while (num1 != 0 || num2 != 0) {
    // int r1 = num1 % 10;
    // num1 /= 10;
    // int r2 = num2 % 10;
    // num2 /= 10;
    // int sum = r1 + r2 + carry;
    // carry = sum / 10;
    // sum %= 10;
    // ans = (ans * 10) + sum;
    // }
    // return ans;
    // }

    // public static int binaryAddition(int num1, int num2) {
    // int ans = 0, carry = 0;
    // while (num1 != 0 || num2 != 0 || carry != 0) {
    // int r1 = num1 % 2;
    // num1 /= 2;
    // int r2 = num2 % 2;
    // num2 /= 2;
    // int sum = r1 + r2 + carry;
    // carry = sum / 2;
    // sum %= 2;
    // ans = (ans * 2) + sum;
    // }
    // return ans;
    // }

    public static int decimalAddition(int n, int m) {
        int ans = 0, carry = 0, pow = 1;
        while (n != 0 || m != 0 || carry != 0) {
            int sum = n % 10 + m % 10 + carry;
            n /= 10;
            m /= 10;
            carry = sum / 10;
            sum %= 10;
            ans += sum * pow;
            pow *= 10;
        }
        return ans;
    }

}

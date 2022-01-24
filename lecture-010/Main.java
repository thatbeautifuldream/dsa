// import java.util.Scanner;
public class Main {

    public static int anyBaseAddition(int n, int m, int b) {
        int ans = 0, pow = 1, carry = 0;

        while (n != 0 || m != 0 || carry != 0) {
            int sum = carry + n % 10 + m % 10;
            n /= 10;
            m /= 10;

            // carry = sum / 2;
            // sum %= 2;

            carry = sum / b;
            sum %= b;

            ans += sum * pow;
            pow *= 10;
        }

        return ans;
    }

    // m - n = ??
    public static int decimalSubtraction(int n, int m) {
        int ans = 0, pow = 1, borrow = 0;
        while (m != 0) {
            int sub = borrow + m % 10 - n % 10;
            n /= 10;
            m /= 10;

            if (sub < 0) {
                sub += 10;
                borrow = -1;
            } else
                borrow = 0;

            ans += sub * pow;
            pow *= 10;
        }

        return ans;
    }

    public static int anyBaseSubtraction(int n, int m, int base) {
        int ans = 0, pow = 1, borrow = 0;
        while (m != 0) {
            int sub = borrow + m % 10 - n % 10;
            n /= 10;
            m /= 10;

            if (sub < 0) {
                sub += base;
                borrow = -1;
            } else
                borrow = 0;

            ans += sub * pow;
            pow *= 10;
        }

        return ans;
    }

    public static int multiplyDigitWithNumber(int n, int digit, int base) {
        int ans = 0, carry = 0, pow = 1;
        while (n != 0 || carry != 0) {
            int prod = carry + (n % 10) * digit;
            n /= 10;

            carry = prod / base;
            prod %= base;

            ans += prod * pow;
            pow *= 10;
        }

        return ans;
    }

    public static int getProduct(int b, int n, int m) {
        int ans = 0, pow = 1;
        while (m != 0) {
            int digitMultiply = multiplyDigitWithNumber(n, m % 10, b);
            m /= 10;

            ans = anyBaseAddition(ans, digitMultiply * pow, b);
            pow *= 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 123, m = 456, b = 7;
        System.out.println(getProduct(b, n, m));
    }
}

// To do :
// 1. anybase substraction
// 2. anybase multiplication
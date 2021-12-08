# Rotate by K

```java
import java.util.Scanner;

public class RotateByK {

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rotatedNumber = rotateNumber(n, k);
        System.out.println(rotatedNumber);
        sc.close();
    }
}
```
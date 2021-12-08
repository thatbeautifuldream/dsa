# Benjamin Bulbs

```java
import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        benjaminBulbs(n);
        sc.close();
    }

    public static void benjaminBulbs(int n) {
        int i = 1;
        while (i * i <= n) {
            System.out.println(i * i);
            i++;
        }
    }
}
```
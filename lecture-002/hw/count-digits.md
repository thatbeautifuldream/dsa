# Count Digits

```java
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        while (n != 0) {
            d++;
            n /= 10;
        }
        System.out.println(d);
        sc.close();
    }
}
```
# Basic Input & Output in Java

```java
import java.util.Scanner;
public class inputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        sc.close();
    }
}
```
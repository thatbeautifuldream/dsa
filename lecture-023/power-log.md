# Power-logarithmic

> 1. You are given a number x.
> 2. You are given another number n.
> 3. You are required to calculate x raised to the power n. Don't change the signature of power function.
> `Note1 -> The previous version expects the call stack to be of n height. This function expects call function to be only log(n) high.`
> `Note2 -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```text
Input Format
A number x
A number n
Output Format
x raised to the power n

Constraints
1 <= x <= 10
0 <= n <= 9
Sample Input
2
5
Sample Output
32
```
## Note

![linear](https://user-images.githubusercontent.com/28717686/146039769-009a43e8-62db-4c2c-8bbc-bb171aed22ff.png)
![breakdown](https://user-images.githubusercontent.com/28717686/146039783-1b4e3399-5615-48ec-a19a-50761211f41a.png)
![relation](https://user-images.githubusercontent.com/28717686/146039799-89a53c7b-5cdf-4008-b7dd-5e517d03fa9e.png)

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(powerLogarithmic(n, p));
    }

    public static int powerLogarithmic(int n, int p){
        return (p == 0) ? 1 : (p % 2 == 0) ? powerLogarithmic(n * n, p / 2) : n * powerLogarithmic(n * n, p / 2);
    }

}
```

# Factorial

> 1. You are given a number n.
> 2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.
> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A number n
Output Format
factorial of n

Constraints
0 <= n <= 10
Sample Input
5

Sample Output
120
```

## Notes

![Screenshot 2021-12-13 at 11 25 30 PM](https://user-images.githubusercontent.com/28717686/145863641-0b967e69-2f42-4652-9d78-629dca80b256.png)

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n == 0) {
            return 1;
        }
        return n*factorial(n-1);
    }

}
```

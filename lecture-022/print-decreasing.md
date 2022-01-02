# Print Decreasing

> 1. You are given a positive number n. 
> 2. You are required to print the counting from n to 1.
> 3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A number n
Output Format
n
n - 1
n - 2
.. 
1

Constraints
1 <= n <= 1000
Sample Input
5
Sample Output
5
4
3
2
1
```
## Notes

![Screenshot 2022-01-02 at 3 57 42 PM](https://user-images.githubusercontent.com/28717686/147873005-f8262231-ba52-4c8d-b371-1abf8d7d4816.png)

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

}
```

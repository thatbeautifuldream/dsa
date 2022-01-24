# Print Increasing Decreasing

> 1. You are given a positive number n. 
> 2. You are required to print the counting from n to 1 and back to n again.
> 3. You are required to not use any loops. Complete the body of pdi function to achieve it. Don't change the signature of the function.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A number n
Output Format
n
n - 1
n - 2
..
1
1
2
3
..
n

Constraints
1 <= n <= 1000
Sample Input
3
Sample Output
3
2
1
1
2
3
```
## Notes

![Screenshot 2021-12-13 at 10 45 05 PM](https://user-images.githubusercontent.com/28717686/145858279-6287292a-d39f-4a25-bb89-20e37ec381e0.png)

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDI(n);
    }

    public static void printDI(int n){
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDI(n-1);
        System.out.println(n);
    }

}
```

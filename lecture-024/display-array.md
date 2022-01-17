# Display Array

> 1. You are given a number n, representing the size of array a.
> 2. You are given n numbers, representing elements of array a.
> 3. You are required to print the elements of array from beginning to end each in a separate line.
> 4. For the above purpose complete the body of displayArr function. Don't change the signature.

> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`


```
Input Format
A number n
n1
n2
.. n number of elements
Output Format
n1
n2
.. n elements

Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 10
Sample Input
5
3
1
0
7
5
Sample Output
3
1
0
7
5
```



## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        displayArray(a, 0);
        sc.close();
    }

    public static void displayArray(int[] a, int i) {
        if (i == a.length) {
            return;
        }
        System.out.println(a[i]);
        displayArray(a, i + 1);
    }

}
```

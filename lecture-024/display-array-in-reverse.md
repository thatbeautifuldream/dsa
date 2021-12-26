# Display Array In Reverse

> 1. You are given a number n, representing the size of array a.
> 2. You are given n numbers, representing elements of array a.
> 3. You are required to print the elements of array from end to beginning each in a separate line.
> 4. For the above purpose complete the body of displayArrReverse function. Don't change the signature.

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
5
7
0
1
3
```


## Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        dar(a, 0);
    }
    public static void dar(int[] a, int i) {
        if(i == a.length) {
            return;
        }
        dar(a, i + 1);
        System.out.println(a[i]);
    }
}
```
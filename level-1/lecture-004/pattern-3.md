# Pattern 3

> 1. You are given a number n.
> 2. You've to create a pattern of \* and separated by tab as shown in output format.

````
Input Format
A number n
Output Format
			*
		*	*
	*	*	*
*	*	*	*

Constraints
1 <= n <= 10
Sample Input
5
Sample Output
				*
			*	*
		*	*	*
	*	*	*	*
*	*	*	*	*
```

## Solution

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n - 1, nst = 1;
        for(int r = 1; r <= n; r++) {
            // spaces
            for(int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            // stars
            for(int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nsp--;
            nst++;
            System.out.println();
        }

    }
}
````

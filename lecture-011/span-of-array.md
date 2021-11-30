``` java
import java.util.Scanner;

public class Main {
    // span of array : max - min
    // diffrence of max and min
    public static int spanOfArray(int[] arr, int n) {
        int max = Integer.MIN_VALUE; // -ve infinity
        int min = Integer.MAX_VALUE; // +ve infinity
        for(int i = 0; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return (max - min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(spanOfArray(arr, n));
        sc.close();
    }

}
```
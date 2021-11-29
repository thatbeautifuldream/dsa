import java.util.Scanner;

public class Arrays {

    public static void takeInput(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt(); // setter
            scn.close();
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // getter
        }
        System.out.println();
    }

    public static boolean findElement(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return true;
            }
        }
        return false;
    }

    public static int maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // understanding arrays in java
    public static void main(String[] args) {
        // declaring an array
        // int[] numbers = new int[5];
        // declaring and initializing an array in one line
        // int[] numbers2 = { 1, 2, 3, 4, 5 };
    }

}

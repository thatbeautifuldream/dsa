import java.util.Scanner;

public class Main {

    // Agenda for today :
    // Binary Search
    // Broken Economy : ceil and floor
    // First and last index
    // Subset

    // Binary Search :
    // 1. Find the middle element of the array
    // 2. Compare the middle element with the target
    // 3. If the target is greater, search the right half of the array
    // 4. If the target is smaller, search the left half of the array
    // 5. If the target is equal, return the index of the target
    // 6. If the target is not found, return -1

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
    }
}

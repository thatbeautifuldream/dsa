import java.util.Scanner;

public class Main {

    // Agenda for today :
    // Binary Search
    // Broken Economy : ceil and floor
    // First and last index
    // Subset

    // Binary Search (BS) :
    // works only on sorted arrays (treat this as a hint to solve a problem)
    // to work on unsorted array, we need to sort to apply BS
    //
    // 1. Find the middle element of the array : mid = (start + end)/2
    // 2. Compare the middle element with the target : target -?- mid
    // 3. If the target is greater, search the right half of the array
    // target > mid ? start = mid + 1 : end = mid - 1
    // 4. If the target is smaller, search the left half of the array
    // 5. If the target is equal, return the index of the target
    // target == mid : return mid
    // 6. If the target is not found, return -1

    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Broken Economy : ceil and floor

    public static void brokenEconomy(int[] arr, int target) {
        int start = 0, end = arr.length - 1, ceil = Integer.MAX_VALUE, floor = Integer.MIN_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
                floor = arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
                ceil = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }

    // First and last index
    public static void firstLastIndex(int[] arr, int d) {
        int start = 0, end = arr.length, fi = -1, li = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (d < arr[mid]) {
                end = mid - 1;
            } else if (d > arr[mid]) {
                start = mid + 1;
            } else {
                li = mid;
                start = mid + 1;
            }
        }
        start = 0;
        end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (d < arr[mid]) {
                end = mid - 1;
            } else if (d > arr[mid]) {
                start = mid + 1;
            } else {
                fi = mid;
                end = mid - 1;
            }
        }
        System.out.println(fi);
        System.out.println(li);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        // System.out.println(binarySearch(arr, target));
        // brokenEconomy(arr, target);
        firstLastIndex(arr, target);
        sc.close();
    }
}

// Practice resource : https://codingbat.com/java
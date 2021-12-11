import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // ArrayList : Dynamic Array (Dynamic capacity)
    // Theory : ArrayList is a collection that contains a variable number of
    // elements.
    // It is similar to an array, but it is not an array.
    // Initialisation : ArrayList<E> list = new ArrayList<E>();
    // Accessing : list.get(index);
    // Modifying : list.add(index, element);
    // Setting : list.set(index, element);
    // Iterating : for (E element : list) {
    // }
    // Removing : list.remove(index); (Deletion is possible, after deletion size
    // also gets decreased)
    // Sorting : Collections.sort(list);
    // Searching : Collections.binarySearch(list, element);
    // Sorting : Collections.binarySearch(list, element, comparator);
    // Sorting : Collections.sort(list, comparator);
    // Sorting : Collections.reverse(list);
    // Sorting : Collections.shuffle(list);
    // Sorting : Collections.swap(list, index1, index2);
    // Sorting : Collections.rotate(list, shift);
    // Sorting : Collections.fill(list, element);
    // Sorting : Collections.replaceAll(list, oldElement, newElement);
    // Sorting : Collections.frequency(list, element);
    // Sorting : Collections.disjoint(list1, list2);
    // Sorting : Collections.min(list);
    // Sorting : Collections.max(list);
    public static Scanner sc = new Scanner(System.in); // Scanner object Global

    public static void arrayListDemo() {
        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Java was supposed to be an Purely Object Oriented Language (OOP)
        // Wrapper Class : Integer (OO Concept)
        // Integer i = new Integer(1); // gets stored in the heap, creates an object
        // Integer i = 1; // gets stored in the stack (stack is faster)
        // Primitive Class : int
        // int i = 1; // gets stored in the stack
        // Add elements to the ArrayList
        list.add(1);
        for (int i : data) {
            list.add(i);
        }
        // Get the size of the ArrayList
        System.out.println("Size of the ArrayList : " + list.size()); // 10
        // Get the element at index 1
        System.out.println("Element at index 1 : " + list.get(1)); // 2
        // Set the element at index 1
        list.set(1, 100);
        System.out.println("Element at index 1 after modification : " + list.get(1)); // 100
        // Remove the element at index 1
        list.remove(1);
        System.out.println("Size of the ArrayList after removal : " + list.size()); // Size of the ArrayList after
                                                                                    // removal : 9
        // Iterate through the ArrayList using for-each loop
        for (int i : list) { // cannot set values can only get values
            System.out.println("Element : " + i);
        }
        // or using enhanced for-loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element : " + list.get(i));
        }
        // print the ArrayList
        System.out.println("ArrayList : " + list); // prints array list beautifully
        // ArrayList : [1, 100, 3, 4, 5, 6, 7, 8, 9, 10]
        // User input in Arraylist
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element : ");
            list2.add(sc.nextInt()); // add elements to the ArrayList using user input
        }
        System.out.println("ArrayList : " + list2); // prints array list beautifully
    }

    public static void main(String[] args) {
        arrayListDemo();
    }
}
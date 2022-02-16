# Lecture 49

## `Priority Queue` in Java

- [PriorityQueue](https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html)
- PriorityQueue is a class that implements the Queue interface and provides a method for retrieving and removing the highest priority element.
- There are two types of Priority Queues : min/max priority queues
- By default java uses min priority queue

## Member functions of PriorityQueue

- `pq.add(e)` : adds an element to the priority queue
- `pq.peek()` : returns the highest priority element
- `pq.poll()` : returns and removes the highest priority element
- `pq.size()` : returns the number of elements in the priority queue
- `pq.remove(e)` : removes an element from the priority queue
- `pq.contains(e)` : returns true if the priority queue contains the specified element
- `pq.clear()` : removes all of the elements from the priority queue

## Demo for Priority Queue

```java
public static void pq() {
    int[] a = { 1, 21, 57, 92, 43, 22, 21, 6 };
    // Initialising a PriorityQueue of type int : by default min PQ
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for (int i : a) {
        pq.add(a[i]); // adding elements to PQ
        // cost of add() is O(log n) where n is the size of PQ
        // for n elements is O(n log n)
    }
    while (!pq.isEmpty()) {
        System.out.println(pq.remove()); // removing elements from PQ
        // cost of remove() is O(log n) where n is the size of PQ
    }
    // printing elements in sorted order
    while (!pq.isEmpty()) {
        System.out.println(pq.peek());
        pq.remove();
    }
}
```

## Three options to make Max Priority Queue : Lambda Expression, Collections.reverseOrder() and Comparator Interface

- We choose to do it with `Collections.reverseOrder()`

```java
import java.util.Collection;

// the code makes a max Priotity queue
PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
```

## Time Complexity

| Operation  | Time Complexity |
| :--------- | :-------------- |
| add()      | O(log n)        |
| peek()     | O(1)            |
| poll()     | O(log n)        |
| remove()   | O(log n)        |
| contains() | O(1)            |
| clear()    | O(n)            |

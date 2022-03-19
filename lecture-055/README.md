# Stack Data Structure | Java

- Stack is a data structure that can be used to store and manipulate a list of items in a LIFO (last in, first out) fashion.
- It is a linear data structure because it is made up of a collection of elements.

## Stack Initialized with an empty list

```java
Stack<Integer> st = new Stack<>();
// Stack operations
st.push(1);
st.push(2);
st.push(3);
st.push(4);
st.push(5);
System.out.println(st);
// Output: [5, 4, 3, 2, 1]
```

## Stack Operations

- `push`: Adds an element to the top of the stack.
- `pop`: Removes an element from the top of the stack and returns it.
- `peek`: Returns the element at the top of the stack without removing it.
- `isEmpty`: Returns true if the stack is empty, false otherwise.
- `size`: Returns the number of elements in the stack.

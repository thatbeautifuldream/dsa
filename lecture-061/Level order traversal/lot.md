# Level Order Traversal (Like BFS)

- Level order traversal is a traversal technique that is used to print the nodes of a tree in a level by level oder.

```text
        1
       / \
      2   3
     / \ / \
     4 5 6 7

LOT : 1 2 3 4 5 6 7
```

- We can use a queue to implement Level Order Traversal.
- Steps to implement Level Order Traversal:
  - Create an empty queue.
  - Enqueue root node to the queue.
  - While queue is not empty:
    - Dequeue a node from the queue.
    - Print the node.
    - Enqueue all the children of the dequeued node to the queue.

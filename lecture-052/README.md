# Lecture 52 | Time and Space Complexity | Sorting Algorithms

## Sorting Algorithms - Bubble Sort

> Sorting - The process of arranging the elements of a collection in order for a given data set.

- Expectation from Bubble Sort : Spit out the sorted array in a non decreasing order.
- In every iteration, the largest element is always at the end of the array.

## Iterations in a Bubble sort

- Given Data Set (Array) : `arr = [4,7,9,1,5,3]`
  > Iteration 1
- Find current largest element in the array => `9`
- Swap the largest element with the last element in the array => `[4,7,9,1,5,3]`
- `arr = [4,7,(9,1),5,3]` => `arr = [4,7,1,9,5,3]`
- `arr = [4,7,1,(9,5),3]` => `arr = [4,7,1,5,9,3]`
- `arr = [4,7,1,5,(9,3)]` => `arr = [4,7,1,5,3,9]`
  > Iteration 2
- Find current largest element in the array => `7`
- Swap the largest element with the second last element in the array => `[4,7,1,5,3,9]`
- `arr = [4,(7,1),5,3,9]` => `arr = [4,1,7,5,3,9]`
- `arr = [4,1,(7,5),3,9]` => `arr = [4,1,5,7,3,9]`
- `arr = [4,1,5,(7,3),9]` => `arr = [4,1,5,3,7,9]`
  > Iteration 3
- Find current largest element in the array => `5`
- Swap the largest element with the third last element in the array => `[4,1,5,3,7,9]`
- `arr = [4,1,(5,3),7,9]` => `arr = [4,1,3,5,7,9]`
  > Iteration 4
- Find current largest element in the array => `4`
- Swap the largest element with the fourth last element in the array => `[4,1,3,5,7,9]`
- `arr = [(4,1),3,5,7,9]` => `arr = [1,4,3,5,7,9]`
- `arr = [1,(4,3),5,7,9]` => `arr = [1,3,4,5,7,9]`
  > Iteration 5
- Find current largest element in the array => `3`
- Swap the largest element with the fifth last element in the array => `[1,3,4,5,7,9]`
- sorted array => `[1,3,4,5,7,9]` (already sorted)

## Number of Iterations in Bubble Sort - `(N-1)`

- In (N-1) iterations, [1, (n-1)element] will be sorted hence 1 will automatically be sorted.

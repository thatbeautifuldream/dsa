# Unbounded Knapsack

`Easy`

> 1. You are given a number n, representing the count of items.
> 2. You are given n numbers, representing the values of n items.
> 3. You are given n numbers, representing the weights of n items.
> 4. You are given a number "cap", which is the capacity of a bag you've.
> 5. You are required to calculate and print the maximum value that can be created in the bag without overflowing it's capacity.
>    `Note -> Each item can be taken any number of times. You are allowed to put the same item again and again.`

## Input Format

- A number n
- v1 v2 .. n number of elements
- w1 w2 .. n number of elements
- A number cap

## Output Format

- A number representing the maximum value that can be created in the bag without overflowing it's capacity

## Constraints

- 1 <= n <= 20
- 0 <= v1, v2, .. n elements <= 50
- 0 < w1, w2, .. n elements <= 10
- 0 < cap <= 10

## Sample Input

```text
5
15 14 10 45 30
2 5 1 3 4
7
```

## Sample Output

`100`

## Solution

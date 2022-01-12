# Aman and garden

`Medium`

```
There is a garden and Aman is the gardener and he wants to arrange trees in a row
of length n such that every Kth plant is non-decreasing in height. For example the plant
at position 1 should be smaller than or equal to the tree planted at position 1+K and plant
at position 1+K should be smaller than or equal to 1+2*K and so on, this
should be true for every position(for eg. 2 <= 2+K <= 2+2*K ...).

Now Aman can change a plant at any position with a plant of any height in order to create
the required arrangment. He wants to know minimum number of trees he will have to change to get the required arrangement.

We"ll be given a plants array which represents the height of plants at every position
and a number K and we need to output the minimum number of plants we will have to change to get the required arrangement.

Example:
plants = [5,3,4,1,6,5];
K=2;

here plants at index (0,2,4) and (1,3,5) should be non decreasing.
plants[0]=5;
plants[2]=4;
plants[4]=6;
We can change the plant at index 2 with a plant of height 5(one change).

Similarly
plants[1]=3;
plants[3]=1;
plants[5]=5;
We can change the plant at index 3 with a plant of height 4(one change).

So minimum 2 changes are required.

Constraints

1<=plants.length<=100000
1<=plants[i],K<=plants.length

Format

Input

First line contains an integer N representing length of the plant array.
Next line contains N space separated integers representing height of trees.
Last line contains an integer K

Output

Output the minimum number of changes required.

Example

Sample Input

6
5
3
4
1
6
5
2

Sample Output

2
```

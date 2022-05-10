# Exact Special Positions in a Binary Matrix

`Easy`

> Given a rows x cols matrix mat, where mat[i][j] is either 0 or 1, print all the coordinate of special positions in mat.

> A position (i,j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).

```
Constraints
rows == mat.length
cols == mat[i].length
1 <= rows, cols <= 100
mat[i][j] is 0 or 1

Format
Input
First line contains two integers which represents number of rows (n) and columns (m) of a matrix respectively.
Next n lines contains m integers each which represents content of matrix.

Output
Print coordinates of all special positions.

Example
Sample Input

3 3
1 0 0
0 1 0
0 0 1

Sample Output
0, 0
1, 1
2, 2
```

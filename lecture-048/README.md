# Lecture 48 | Hash Map

- `Hash-Map` : A data structure that stores <key, value> pairs.
- eg : `"Milind" : 4356, "Raj" : 1234, "Ravi" : 3456` (key-value pairs)
- Example problem : To find index of the key in array, arr = [1,2,3,4,5,6,7,8,9,10], key = 5 => index = 4 (index starts from 0)
- Lets say we need to find m elements in the array arr = [1,2,3,4,5,5,5,5,5,5] and key = 5, then we need to find the m elements in the array. => [5,5,5,5,5,5]
- Hashmap is an optimsation over normal traversal of array.
- Traversal of array is O(n) and hashmap/hashset is O(1)
- Searching in hashmap is O(1) (constant time) and insertion is O(1) (constant time) faster than array traversal.

|        Operation         | Time Complexity |
| :----------------------: | :-------------: |
| Searching (value get...) |      O(1)       |
| Insertion (value put...) |      O(1)       |
| Check if present or not  |      O(1)       |

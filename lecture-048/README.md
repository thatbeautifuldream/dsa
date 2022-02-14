# Lecture 48 | Hash Map

- `Hash-Map` : A data structure that stores <key, value> pairs.
- eg : `"Milind" : 4356, "Raj" : 1234, "Ravi" : 3456` (key-value pairs)
- Example problem : To find index of the key in array, arr = [1,2,3,4,5,6,7,8,9,10], key = 5 => index = 4 (index starts from 0)
- Lets say we need to find m elements in the array arr = [1,2,3,4,5,5,5,5,5,5] and key = 5, then we need to find the m elements in the array. => [5,5,5,5,5,5]
- Hashmap is an optimsation over normal traversal of array.
- Traversal of array is O(n) and hashmap/hashset is O(1)
- Searching in hashmap is O(1) (constant time) and insertion is O(1) (constant time) faster than array traversal.

## Hashmap Operations

|        Operation         |  Time Complexity  |
| :----------------------: | :---------------: |
| Searching (value get...) | O(1) or O(Lambda) |
| Insertion (value put...) |       O(1)        |
| Check if present or not  |       O(1)        |

- Lambda : Hashing Constant

## Hashmap / Hashtable (A deep dive into the topic)

- Hashmap is a data structure that stores key-value pairs. Lets take an example of a hashmap.

| Country (key) | Population (value) |
| :-----------: | :----------------: |
|    "India"    |        428         |
|    "China"    |        603         |
|     "USA"     |        400         |

- Hashmap combinations : <String, Integer>; <String, String>, <Integer, String>, <Integer, Integer>, <String, Double> ...
- Key is supposed to be unique.

## Hashmap Operations in Java

## `hm.put(key, value)` : Inserts the key-value pair into the hashmap. In O(1) time

> hm.put("India", 428);
> hm.put("China", 603);
> hm.put("USA", 400);

|  key  | value |
| :---: | :---: |
| India |  428  |
| China |  603  |
|  USA  |  400  |

> hm.put("India", 200);
> hm.put("USA", 28);
> hm.put("Dubai", 530);

|  key  |       value       |
| :---: | :---------------: |
| India | 200 (get updated) |
| China |        603        |
|  USA  | 28 (gets updated) |
| Dubai | 530 (gets added)  |

- Important Points

  - When same key gets inserted, value gets updated.

## `hm.get(key)` : Returns the value of the key. In O(1) time

> hm.get("India"); // Returns 200
> hm.get("China"); // Returns 603
> hm.get("USA"); // Returns 28
> hm.get("Dubai"); // Returns 530
> hm.get("Canada"); // Returns null

- Important Points

  - If key is not present, returns null.

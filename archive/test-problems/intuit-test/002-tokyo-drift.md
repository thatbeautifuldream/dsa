# Tokyo Drift

`Easy`

```
There is a racing competition which will be held in your city next weekend. There are N racers who are going to take part in the competition. Each racer is at a given distance from the finish line, which is given in an integer array.

Due to some safety reasons, total sum of speeds with which racers can drive is restricted with a given limit. Since, cost of organizing such an event depends on how long the event will last, you need to find out the minimum time in which all racers will cross the finishing line, but sum of speeds of all racers should be less than or equal to the given limit.

If it is impossible to complete the race for all racers within given limit, we have to return -1.

> Note: Speed is defined as Ceil (distance/time), where ceil represents smaller than or equal to. For example if distance is 20 km and time taken to travel is 3 hrs then speed equals ceil(20/3) i.e. 7 km/hr.

Example: Let us take 4 Racers with Distances from finishing line as [15 km, 25 km, 5 km, 20 km], and the maximum sum of speeds allowed is 12 km/hr. The minimum time in which all racers will reach the finishing line will be 7 hours.

Racer 1 will have 15 km / 7 hr = 3 km/hr speed
Racer 2 will have 25 km / 7 hr = 4 km/hr speed
Racer 3 will have 05 km / 7 hr = 1 km/hr speed
Racer 4 will have 20 km / 7 hr = 3 km/hr speed

Hence, the total sum of speeds will be (3 + 4 + 1 + 3) = 11 km/hr which is less than or equal to 12 km/hr.

Constraints

1 <= N <= 100000
1 <= racers[i] <= 10000000
1 <= Limit <= 10000000

Format

Input

First line contains an integer N representing length of array.
Next line contains N space seprated integers representing distance from finishing line.
Last line contains an integer representing limit of sum of speeds with which racers can drive

Output

A single line integer representing minimum time in which all racers will cross the finishing line, If not possible print -1

Example

Sample Input

4
15 25 5 20
12

Sample Output

7
```

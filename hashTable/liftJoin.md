# Hashmap LEFT JOIN

Hash - A hash is the result of some algorithm taking an incoming string and converting it into a value that could be used for either security or some other purpose. In the case of a hashtable, it is used to determine the index of the array.

## Challenge

Write a function that LEFT JOINs two hashmaps into a single data structure.

## Approach & Efficiency

- create a method that accepts a hashMap and a resultList
- loop from 0 to buckets
- iterate while the head is not null
- declare a new list and add to it the head key and value
- check if the hashmap contain the head key add the hashmap to the list if not add null to the list
- add the list to the result lists

**BigO:**
Time => O(n*2)
Space => O(n)

## Solution

![whiteboard](./img/Whiteboard%20(12).png)

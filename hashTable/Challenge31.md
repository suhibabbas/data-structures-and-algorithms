# Challenge Summary

Write a function that finds the first word to occur more than once in a string

## Whiteboard Process

![whiteboard](./img/Whiteboard%20(11).png)

## Approach & Efficiency

- create a method the accepts a String as an input
- create an array of strings equal the input splitted by space
- create hashMap with string key and string value
- iterate through the array after delete all the commas
- check if the hash map contain the had the word that in the array if yes return the word if not store it in the hash map

**BigO:**
    - Time => O(n)
    - Space => O(n)

## Solution

to run the code call the method exampel :

```java
        System.out.println(repeatedWord("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."));
```

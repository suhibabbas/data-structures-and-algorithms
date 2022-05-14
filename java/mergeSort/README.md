# Challenge Summary

Implement the MergeSort without using any built-in methods

## Whiteboard Process

![whiteboard](./img/Whiteboard%20(6).png)

## Approach & Efficiency

- create mergeSort method that accept three parameters (array, start integer, and end integer)
- check if the end - start less than 2 then return
- find the middle point
- call the mergesort for the first half
- call the mergesort for the second half
- merge the tow halves
- create marge method that accept four parameters (array, start integer , mid integer, and end integer)
- check if array index [mid - 1] <= array index[mid] then return

## Solution

```java
public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }
```
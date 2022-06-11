# Challenge Summary

Implement the insertion sort method from scratch using pseudocode that given

## Whiteboard Process

![whiteboard](./img/Whiteboard%20(22).png)

## Approach & Efficiency

- Consider the first element of the list as pivot
- Define two variables i and j. Set i and j to first and last elements of the list respectively
- Increment i until list[i] > pivot then stop.
- Decrement j until list[j] < pivot then stop.
- If i < j then exchange list[i] and list[j].
- Repeat steps 3,4 & 5 until i > j.
- Exchange the pivot element with list[j] element.

## Solution

```java
 public static void quickSort(int[] arr, int left, int right)
    {
        if (left < right) {
            int position = partition(arr, left, right);

            quickSort(arr, left, position - 1);

            quickSort(arr, position + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int low = left - 1;

        for (int i = left; i <= right; i++) {
            if(arr[i] < pivot)
            {
                low++;
                swap(arr, i, low);
            }
        }
        swap(arr, right, low + 1);
        return low + 1;
    }


    public static void swap(int[] arr, int i, int low)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
```
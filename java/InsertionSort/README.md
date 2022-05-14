# Challenge Summary

Implement the insertion sort method from scratch using pseudocode that given

## Whiteboard Process

![whiteboard](./img/Whiteboard%20(7).png)

## Approach & Efficiency

- Create a method that accepts an array
- loop throw the array by starting from index 1
- initialize integer equal index-1
- initialize integer with the current array value
- loop while integer more or equal zero and the temp  less then array [integer]
- sort the values
- return array

## Solution

```java
  public static void main(String[] args) {

        int[] arr = {20,18,12,8,5,-2};
        int[] newArr = InsertionSort(arr);

        for (int i = 0; i<newArr.length ;i++ ){
            System.out.println(newArr[i]);
        }

    }

    public static int[] InsertionSort(int[] arr){
        for (int i = 1 ; i < arr.length;i++){
            int j = i-1;
            int temp = arr[i];

            while (j >= 0 && temp <arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
                arr[j+1] = temp;
            }
        }
        return arr;
    }
```

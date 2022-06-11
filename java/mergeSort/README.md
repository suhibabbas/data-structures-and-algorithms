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
 public static ArrayList<Integer> mergeSort(ArrayList<Integer> arr){
        int n = arr.size();
        if(n>1) {
            int mid = n / 2;
            ArrayList<Integer> left = new ArrayList<>();
            for (int i = 0; i < mid; i++) {
                left.add(arr.get(i));
            }

            ArrayList<Integer> right = new ArrayList<>();
            for (int i = mid; i < arr.size(); i++) {
                right.add(arr.get(i));
            }

            mergeSort(left);
            mergeSort(right);
            Merge(left, right, arr);
        }
        System.out.println("Arr => " + arr);
        return arr;
    }


    public static ArrayList<Integer> Merge(ArrayList<Integer> left , ArrayList<Integer> right , ArrayList<Integer> arr) {
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;

        while (i<left.size() && j < right.size()){
            if(left.get(i) < right.get(j))
            {
                arr.set(k , left.get(i));
                i++;
            }
            else
            {
                arr.set(k , right.get(j));
                j++;
            }
            k++;
        }
        // Collect remaining elements
        while(i < left.size())
        {
            arr.set(k , left.get(i));
            i++;
            k++;
        }
        while(j < right.size())
        {
            arr.set(k , right.get(j));
            j++;
            k++;
        }
        return arr ;
    }
```
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InsertionSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AppTest {
@Test void insertionSortTest(){

    int[] arr1 = {20,18,12,8,5,-2};
    int[] arr2 = {5,12,7,5,5,7};
    int[] arr3 = {2,3,5,7,13,11};


    int[] expected1 = {-2,5,8,12,18,20};
    int[] expected2 = {5,5,5,7,7,12};
    int[] expected3 = {2,3,5,7,13,11};

        assertArrayEquals(expected1, App.InsertionSort(arr1));
        assertArrayEquals(expected2, App.InsertionSort(arr2));
        assertArrayEquals(expected3, App.InsertionSort(arr3));
}
}

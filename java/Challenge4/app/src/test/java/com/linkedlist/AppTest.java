/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AppTest {
    @Test void KthTest(){
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        String result = list.kth(3);
            assertEquals("4",result);

    }

    @Test void zipTest() {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> zipList = new LinkedList<>();

        list1.insert(1);
        list1.insert(3);

        list2.insert(2);
        list2.insert(7);

        zipList.zip(list1,list2);

        assertEquals("{3} ->{7} ->{1} ->{2} -> null",zipList.toString());


    }
}

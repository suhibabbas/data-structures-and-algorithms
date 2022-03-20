/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.challenge;

import com.challenge.queue.structure.Queue;
import com.challenge.stack.data.StackNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AppTest {
    Queue queue;

    @BeforeEach
    void setUp(){
        queue = new Queue();
    }

    @Test void enQueueTest(){
        StackNode expected = new StackNode(1);

        boolean actual = queue.enQueue(expected);

        assertTrue(actual);
    }

    @Test void deQueueTest(){
        StackNode expected = new StackNode(1);
        queue.enQueue(expected);

        StackNode actual =queue.deQueue();

        assertEquals(expected,actual);
    }
}
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.lab;

import com.lab.queue.data.QueueNode;
import com.lab.queue.structure.Queue;
import com.lab.stack.data.StackNode;
import com.lab.stack.structure.Stack;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    Stack stack;
    Queue<Integer> queue;

    @BeforeEach
    void setUp(){
        stack= new Stack();
        queue = new Queue();
    }

    @Test void stackPushTest() {
        StackNode expected1 = new StackNode(1);
        StackNode actual = stack.push(expected1);

        assertEquals(expected1,actual);

    }
    @Test void  stackPopTest(){
        StackNode expected = new StackNode(1);
        stack.push(expected);
        StackNode actual1 = stack.pop();

        assertEquals(expected,actual1);

    }
    @Test void stackPeekTest(){

        StackNode expected = new StackNode(3);

        stack.push(new StackNode(1));
        stack.push(new StackNode(7));
        stack.push(new StackNode(4));
        stack.push(expected);

        StackNode actual = stack.peek();
        assertEquals(expected,actual);
    }

    @Test void enQueueTest(){
        boolean actual = queue.enqueue(5);
        assertTrue(actual);
    }

    @Test void deQueueTest(){
        QueueNode<Integer> expected = new QueueNode<>(1);
        queue.enqueue(1);

        QueueNode<Integer> actual = queue.dequeue();
        assertEquals(expected.toString(),actual.toString());
    }
    @Test void queuePeek(){
        QueueNode<Integer> expected = new QueueNode<>(1);
        queue.enqueue(1);

        QueueNode<Integer> actual = queue.peek();
        assertEquals(expected.toString(),actual.toString());
    }
}

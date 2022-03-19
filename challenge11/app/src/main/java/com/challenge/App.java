/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.challenge;

import com.challenge.queue.structure.Queue;
import com.challenge.stack.data.StackNode;
import com.challenge.stack.structure.Stack;

public class App {

    public static void main(String[] args) {

        Queue queue =new Queue();

        try {
            System.out.println(queue.enQueue(new StackNode(1)));
            System.out.println(queue.enQueue(new StackNode(2)));

            System.out.println(queue.deQueue());
//            System.out.println(queue.isEmpty());
            System.out.println(queue);

        }catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}

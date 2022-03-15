/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.lab;

import com.lab.queue.data.QueueNode;
import com.lab.queue.structure.Queue;
import com.lab.stack.data.StackNode;
import com.lab.stack.structure.Stack;

public class App {
    public static void main(String[] args) {
        System.out.println("############## Stack ##############");

        Stack stack = new Stack();

        stack.push(new StackNode("Suhiab","000-000-000"));
        stack.push(new StackNode("Mohammad","111-111-111"));

        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);

        System.out.println("############## Queue ##############");

        Queue queue =new Queue();

        queue.add(new QueueNode("Suhib"));
        queue.add(new QueueNode("Mohammad"));
        queue.add(new QueueNode("Ahmmad"));

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();


        System.out.println(queue);



    }
}

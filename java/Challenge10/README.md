# Stacks and Queues

**Stack:** is a data structure that consists of Nodes Each Node references the next Node in the stack, but does not reference its previous.

**Queue:** is a queue is a linear data structure or a collection in Java that stores elements in a FIFO (First In, First Out) order.

## Challenge

1. Create a Stack class that has a top property. It creates an empty Stack when instantiated, The class should contain the following methods:
    - push
    - pop
    - peek
    - is empty

2. Create a Queue class that has a front property. It creates an empty Queue when instantiated, The class should contain the following methods:
    - enqueue
    - dequeue
    - peek
    - is empty

## API

**Stack:**

1. Push - Nodes or items that are put into the stack are pushed
2. Pop - Nodes or items that are removed from the stack are popped. When you attempt to pop an empty stack an exception will be raised.
3. Top - This is the top of the stack.
4. Peek - When you peek you will view the value of the top Node in the stack. When you attempt to peek an empty stack an exception will be raised.
5. IsEmpty - returns true when stack is empty otherwise returns false.

**Queue:**

1. Enqueue - Nodes or items that are added to the queue.
2. Dequeue - Nodes or items that are removed from the queue. If called when the queue is empty an exception will be raised.
3. Front - This is the front/first Node of the queue.
4. Rear - This is the rear/last Node of the queue.
5. Peek - When you peek you will view the value of the front Node in the queue. If called when the queue is empty an exception will be raised.
6. IsEmpty - returns true when queue is empty otherwise returns false.

package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(firstQueue.remove());
        deque.addFirst(firstQueue.remove());
        deque.addFirst(secondQueue.remove());
        deque.addFirst(secondQueue.remove());

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            firstQueue.add(deque.remove());
            deque.addFirst(firstQueue.remove());
            deque.addFirst(firstQueue.remove());

            secondQueue.add(deque.remove());
            deque.addFirst(secondQueue.remove());
            deque.addFirst(secondQueue.remove());
        }

        ArrayDeque<Integer> tempDeque = new ArrayDeque<>();
        Iterator<Integer> iterator = deque.descendingIterator();
        while (iterator.hasNext()) {
            tempDeque.add(iterator.next());
        }

        return tempDeque;
    }
}

package DataStructures.queue;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class PriorityQueue<T extends Comparable<? super T>> {

    private Vector<T> queue;
    private int size;
    private int capacity;
    private static final int INITIAL_CAPACITY = 20;

    public PriorityQueue() {
        this.size = 0;
        this.capacity = INITIAL_CAPACITY;
        this.queue = new Vector<T>(INITIAL_CAPACITY);
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        new Random().ints().limit(10)
//                .forEach(priorityQueue::enqueue);
        List<Integer> integers = Arrays.asList(787, 83, 66, 1, 7, 5, 777, 9);
        for (Integer i: integers) {

        }

        for(int i = 0; i < 10; i++) {
            System.out.println(priorityQueue.peek());
            priorityQueue.dequeue();
        }
    }

    public T enqueue(T t) {
        if(size == capacity) {
            queue.ensureCapacity(size*2);
        } else {
            int i = size - 1;
            while(i >= 0 &&  queue.get(i).compareTo(t) > 0) {
                // Push each element in the queue back until we find the correct spot
                queue.set(i+1,  queue.get(i));
                i--;
            }
            queue.insertElementAt(t, i+1);
        }
        return t;
    }

    public T dequeue() {
        T t = queue.get(0);
        queue.removeElementAt(0);
        return t;
    }

    public T peek() {
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

package Latihan2;

public class Main {
    private static class Queue {
        private String[] elements;
        private int front;
        private int rear;
        private int size;

        public Queue(int capacity) {
            elements = new String[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        public void enqueue(String element) {
            if (isFull()) {
                throw new RuntimeException("Queue is full");
            }
            rear = (rear + 1) % elements.length;
            elements[rear] = element;
            size++;
        }

        public String dequeue() {
            if (isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            String element = elements[front];
            front = (front + 1) % elements.length;
            size--;
            return element;
        }

        public String peek() {
            if (isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            return elements[front];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == elements.length;
        }
    }

    public void queueExample() {
        Queue queue = new Queue(4);
        queue.enqueue("Java");
        queue.enqueue("DotNet");
        queue.enqueue("PHP");
        queue.enqueue("HTML");
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("peek: " + queue.peek());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("peek: " + queue.peek());
    }

    public static void main(String[] args) {
        new Main().queueExample();
    }
}

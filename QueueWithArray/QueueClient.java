package QueueWithArray;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue= new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(21);
        queue.dequeue();
        queue.enqueue(88);
        queue.enqueue(8);
        queue.enqueue(99);
        queue.enqueue(111);
    }
}

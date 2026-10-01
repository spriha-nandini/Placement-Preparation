package s6day1;

public class implementation {
    public static void main(String[] args){
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(6);
        queue.enqueue(3);
        queue.print_frontRear();
        queue.enqueue(12);
        queue.enqueue(24);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(9);
        queue.print_frontRear();
    }
}

package s6day1;
import java.util.*;
public class q {
    public static void main(String[] args) {
    QueueLinkedList queue = new QueueLinkedList();
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50);
    queue.enqueue(60);
    queue.print_frontRear();
    queue.dequeue();
    queue.print_frontRear();
    }
}
}

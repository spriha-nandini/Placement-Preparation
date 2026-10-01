package s6day1;
public class QueueLinkedList {
    private Node front, rear;
    private int queueSize;
    private class Node{
        int data;
        Node next;
    }
public QueueLinkedList(){
    front = null;
        rear = null;
    queueSize = 0;
}
public boolean isEmpty(){
    return queueSize == 0;
    }
public int dequeue(){
    int data = front.data;
    front = front.next;
        if(front == null){
            rear = null;
        }
    queueSize--;
    System.out.println("Element "+ data + " Removed from the queue");
    return data;
}
public void enqueue(int data){
    Node oldRear = rear;
    rear = new Node();
    rear.data = data;
    rear.next = null;
        if(isEmpty()){
            front = rear;
        }else{
            oldRear.next = rear;
        }
    queueSize++;
    System.out.println("Element "+ data + " Added to the queue");
    }
public void print_frontRear(){
    if(isEmpty()){
        System.out.println("Queue is empty");
        return;
        }
        System.out.println("Front Element: " + front.data + ", Rear Element: " + rear.data);

        // System.out.println("Front Element: " + front.data);
        // System.out.println("Rear Element: " + rear.data);
}

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
package s5day3;
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Linked{
    public static void main(String args[]){
        Node head=new Node(10);
        head.next=new Node(20);
        System.out.println(head.data);
    }
}

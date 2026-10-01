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
class linkl{
    Node head;
    public void append(int data){
        Node newNode = new Node (data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
}
public class link {
    public static void main(String args[]){
        linkl myList = new linkl();
        myList.append(10);
        myList.append(20);
        myList.append(30);
        System.out.println();
    }
}

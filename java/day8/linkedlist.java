package day8;
import java.util.*;
    //declaration of the node
    class Node{//initial node
        int data;//datatype of first node and the data
        Node next;//address node for the next node
        public Node(int data){
            this.data=data;//this assures that this value is limited to this class only
            this.next=null;//assigning the value as null (address will be given later)
        }
    }
    class LinkedList{
        Node head;
        public void insert(int data){//transversing through the list
        Node new_node=new Node(data);//making a new node
        if(head ==null){//if the head is null then new node is the head node
            head = new_node;
        }else{
            Node last=head;
            while(last.next!=null){
                last=last.next;
            }last.next=new_node;
        }
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // End of the list
    }
}

class Main{
public static void main(String[] args) {
    LinkedList list=new LinkedList();
    list.insert (1);
    list.insert (2);
    list.insert (3);
    list.insert (4);
    list.insert (5);
    list.insert (6);
    list.insert (7);
    list.insert (8);
    list.printList();
}
}
public Node insertatbeggining(Node head,int value){
    Node new_node = new Node(value);
    new_node.next = head;
    head = new_node;
}
public Node insertatend(Node head,int value){
    Node new_node = new Node(value);
    if (head == null) {
        head = new_node;
    } else {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
    }
}
Node temp=head;
int count=1;
while(count<pos-1 && temp!=null){
    temp=temp.next;
    count++;
}
    


package day9;
import java.util.*;
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head;

    public void insert(int data){
        Node new_node = new Node(data);
        if (head==null){
            head=new_node;
        }else{
            Node last=head;
            while (last.next!=null){
                last=last.next;
            }
            last.next=new_node;
        }
    }

    public boolean contains (int value){
        Node current=head;
        while (current!=null){
            if (current.data==value){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public void printList(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class Main{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of elements you want to add: ");
        int a=sc.nextInt();

        for(int i=0;i<a;i++){
            System.out.print("enter value "+(i+1)+": ");
            list.insert(sc.nextInt());
        }
        System.out.println("the list is: ");
        list.printList();

        System.out.println("enter the number you want to check: ");
        int b =sc.nextInt();

        if(list.contains(b))
            {
                System.out.println("yes the element is in the list");
            }else{
                System.out.println("no, the element is not in the list");
            }
            sc.close();
    }
}

package day8;
import java.util.*;

// Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List Implementation
class LinkedList {
    Node head;

    // Insert at the end
    public void insert(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(int value) {
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;
    }

    // Insert at the end
    public void insertAtEnd(int value) {
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

    // Insert at a specific position
    public void insertAtPosition(int value, int pos) {
        Node new_node = new Node(value);

        if (pos == 1) { // If position is 1, insert at beginning
            new_node.next = head;
            head = new_node;
            return;
        }

        Node temp = head;
        int count = 1;
        
        while (count < pos - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        new_node.next = temp.next;
        temp.next = new_node;
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // End of the list
    }
}

// Main Class
class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert at the end
        list.insert(2);
        list.insert(3);
        list.insert(5);

        // Insert at the beginning
        list.insertAtBeginning(1);

        // Insert at the end
        list.insertAtEnd(6);

        // Insert at position 3
        list.insertAtPosition(4,3);

        // Print the final list
        list.printList();
    }
}

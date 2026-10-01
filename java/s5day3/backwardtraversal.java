package s5day3;
// Java Program for Backward Traversal (Iterative) of
// Doubly Linked List

class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

class GfG {

    // Function to traverse the doubly linked list in
    // backward direction
    public static void backwardTraversal(Node tail) {
      
        // Start traversal from the tail of the list
        Node curr = tail;

        // Continue until current node is not null
        while (curr != null) {

            // Output data of the current node
            System.out.print(curr.data + " ");

            // Move to the previous node
            curr = curr.prev;
        }
    }

    public static void main(String[] args) {

        // Create a hardcoded doubly linked list:
        // 1 <-> 2 <-> 3
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.print("Backward Traversal: ");
        backwardTraversal(third);
    }
}
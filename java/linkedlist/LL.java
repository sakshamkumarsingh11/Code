// package linkedlist;

// public class LL {
//     class Node{
//         String data;
//         Node next; // next is the refrenece to address of the  pointer of the next node and next type is Node
//         Node(String data){ // constructor to initialize the data
//             this.data = data;
//             this.next = null;   //next is null for the default case
//         }
    
//         public static void main(String[] args) {
//             LL list = new LL();
//         }
//     }
    
// }
// // humne pehle ek class banai LL jisme ek class hai Node jo ki ek node ko represent karega
// // Node class me 2 instance variable hai data and next
// // data me hum node ka data store karenge and next me hum next node ka reference store karenge
// // Node class me ek constructor hai jisme data ko initialize karte hai and next ko null karte hai
// // LL class me main method hai jisme hum LL class ka object banate hai
// // fir hum add krne wlae step krenge jisme doh type hote hai "add at first" and "add at last"






// ✅ Singly Linked List Implementation in Java
class Node {
    int data;   // Data part
    Node next;  // Pointer to next node

    // Constructor to initialize a node
    Node(int data) {
        this.data = data;
        this.next = null; // Initially, next is null
    }
}


class LinkedList {
    Node head; // Head (starting node) of Linked List

    // 🔹 1️⃣ Insert at the Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // Create new node
        newNode.next = head;           // Point new node to old head
        head = newNode;                // Update head to new node
    }

    // 🔹 2️⃣ Insert at the End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { // If list is empty
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) { // Traverse to last node
            temp = temp.next;
        }
        temp.next = newNode; // Link last node to new node
    }

    // 🔹 3️⃣ Insert at a Specific Position
    public void insertAtPosition(int data, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position!");
            return;
        }
        Node newNode = new Node(data);
        if (pos == 1) { // If inserting at head
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 🔹 4️⃣ Delete from the Beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next; // Move head to next node
    }

    // 🔹 5️⃣ Delete from the End
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) { // If only one node is present
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) { // Reach second last node
            temp = temp.next;
        }
        temp.next = null; // Remove last node
    }

    // 🔹 6️⃣ Delete from a Specific Position
    public void deleteFromPosition(int pos) {
        if (head == null || pos < 1) {
            System.out.println("Invalid position or empty list!");
            return;
        }
        if (pos == 1) { // Delete head
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of range!");
            return;
        }
        temp.next = temp.next.next; // Remove node
    }

    // 🔹 7️⃣ Search for a Node
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true; // Found key
            temp = temp.next;
        }
        return false; // Key not found
    }

    // 🔹 8️⃣ Reverse the Linked List
    public void reverse() {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse current node
            prev = current;      // Move prev to current
            current = next;      // Move current to next
        }
        head = prev; // Update head
    }

    // 🔹 9️⃣ Find the Middle of the Linked List
    public void findMiddle() {
        if (head == null) return;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move one step
            fast = fast.next.next; // Move two steps
        }
        System.out.println("Middle Element: " + slow.data);
    }

    // 🔹 🔟 Display the Linked List
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

// ✅ Main Class to Test the Linked List
public class LL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);
        list.insertAtPosition(15, 3);
        list.display(); // Output: 5 → 10 → 15 → 20 → 30 → NULL

        // Delete elements
        list.deleteFromBeginning();
        list.deleteFromEnd();
        list.deleteFromPosition(2);
        list.display(); // Output: 10 → 20 → NULL

        // Search element
        System.out.println("Is 20 in the list? " + list.search(20)); // true

        // Reverse the list
        list.reverse();
        list.display(); // Output: 20 → 10 → NULL

        // Find middle element
        list.findMiddle(); // Output: Middle Element: 20
    }
}

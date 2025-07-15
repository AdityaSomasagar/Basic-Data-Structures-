class Node1 {
    int data;
    Node1 next;
    Node1 prev;

    Node1(int data) {
        this.next = null;
        this.prev = null;
        this.data = data;
    }
}

public class DoublyLinkedList {
    Node1 head;

    public void insertAtBeginning(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            System.out.println("list is empty.");
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data){
        Node1 newNode = new Node1(data);
        Node1 temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
    }

    public void display() {
        Node1 temp = head;
        System.out.print(" null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.display();

    }
}
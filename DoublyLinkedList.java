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

    public void insertAtSpecificPos(int data, int pos){
        Node1 newNode = new Node1(data);
        Node1 temp = head;
        if(pos<1){
            System.out.println("Index out of bounds");
        } else if(pos==1){
            insertAtBeginning(data);
        } else {
            for(int i=0; i<pos-1 && temp.next!=null; i++){
               temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }

    }

    public void deleteInTheBeginning(){
       head = head.next;
       head.prev = null;
    }

    public void deleteAtEnd(){
        Node1 temp = head;
        for(int i=0; temp.next.next!=null; i++){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtSpecificPos(int pos) {
        Node1 temp = head;
        if (pos == 0) {
            deleteInTheBeginning();
        } else {
            for (int i = 1; i < pos - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void display() {
        Node1 temp = head;
        System.out.print(" null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println(" null ");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display();
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.display();
        list.insertAtSpecificPos(30, 2);
        list.display();
        list.deleteAtEnd();
        list.display();
        list.deleteInTheBeginning();
        list.display();
        list.deleteAtSpecificPos(0);
        list.display();


    }
}
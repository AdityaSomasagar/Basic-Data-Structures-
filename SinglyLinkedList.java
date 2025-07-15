class Node{
    int data;
    Node Next;
    Node(int data){
        this.data = data;
        this.Next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    public void insertAtBeg(int data) {
        Node newNode = new Node(data); //constructor
        newNode.Next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node temp = head;
        Node newNode = new Node(data);
        while (temp.Next != null) {
            temp = temp.Next;
        }
        temp.Next = newNode;
    }

    public void insertAtSpecificPos(int data, int pos) {
        if (pos < 1) {
            System.out.println("Out of bound");
        } else if (pos == 1) {
            insertAtBeg(data);
        } else {
            Node temp = head;
            Node newNode = new Node(data);
            for (int i = 1; i < pos - 1 && temp.Next != null; i++) {
                temp = temp.Next;
            }
            if (temp == null) {
                System.out.println("out of bound");
            }

            newNode.Next = temp.Next;
            temp.Next = newNode;
        }
    }

    public void deleteAtBeginning(){
            head = head.Next;
    }
    public void deleteAtSpecificPos(int pos){
        Node temp = head;
        if(pos<1){
            System.out.println("Out of Bound ");
        }
        else if(pos == 1){
            deleteAtBeginning();
        }
        else if(temp == null || temp.Next == null){
            System.out.println("list is empty, ");
        }else{
            for(int i=1; i<pos-1; i++){
                temp = temp.Next;
            }
            temp.Next = temp.Next.Next;
        }
    }

        public void deleteAtEnd(){
            Node temp = head;
            if(temp == null){
                System.out.println("list is empty");
            }
            if(temp.Next == null){
                System.out.println("only 1 value present");
            }
            while (temp.Next.Next!=null){
                temp = temp.Next;
            }
            temp.Next = null;
        }


    public void display () {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.Next;
        }
        System.out.println("null");
    }
        public static void main (String[]args){
            SinglyLinkedList list = new SinglyLinkedList();
            System.out.println("After Inserting at beginning: ");
            list.insertAtBeg(10);
            list.insertAtBeg(20);
            list.insertAtBeg(30);
            list.insertAtBeg(40);
            list.insertAtBeg(50);

            list.display();
            System.out.println("After Inserting at end: ");
            list.insertAtEnd(70);
            list.display();
            System.out.println("After inserting at specific position");
            list.insertAtSpecificPos(75, 4);
            list.display();
            System.out.println("Delete at end");
            list.deleteAtEnd();
            list.display();
            System.out.println("Delete in the beginning");
            list.deleteAtBeginning();
            list.display();
            System.out.println("Delete at specific position");
            list.deleteAtSpecificPos(3);
            list.display();
        }
    }

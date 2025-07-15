class Stack {
    int data;
    Stack next;

    //constructor
    Stack(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackOne {

    Stack top;

    public void push(int data) {
        Stack newNode = new Stack(data);
        newNode.next = top;
        top = newNode;

    }

    public void peek(){
        if (top==null){
            System.out.println("underflow");
        }
        else{
            System.out.println(top.data); // top
        }
    }


    public void pop(){
        if(top == null){
            System.out.println("underflow");
        }
        top = top.next;
    }
    public void display(){
        if(top == null){
            System.out.println("Stack is empty. ");
        }
        Stack temp = top;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
    StackOne op = new StackOne();
    op.push(10);
    op.push(20);
    op.push(30);
    op.push(40);
    op.display();

    op.peek();

    op.pop();
    op.display();
    }
}

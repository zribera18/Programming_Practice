package Practice;

public class Stack {

    Node head;

    public Stack(){
        head = null;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int pop(){
        int current = head.data;
        head = head.next;

        return current;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void printStack(){
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int size(){
        Node current = head;
        int size = 0;
        while (current != null){
            size++;
            current=current.next;
        }
        return size;
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(0);
        stack.push(100);
        stack.push(-5);
        System.out.println("Size: " + stack.size());
        stack.printStack();
    }
}

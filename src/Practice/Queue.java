package Practice;

public class Queue {
    Node head;
    Node tail;

    public Queue(){
        head = tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int dequeue(){
        if (!isEmpty()){
            int value = head.data;
            head = head.next;
            return value;
        } else {
            return -1;
        }
    }

    public void enqueue(int value){
        Node newNode = new Node(value);

        if (isEmpty()){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int size(){
        return 0;
    }

    public static void main(String[] args){
        Queue queue = new Queue();

        queue.enqueue(0);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}

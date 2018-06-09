package Practice;

public class LinkedList {

    public Node head;

    public LinkedList(){
    }

    public Node addToTail(int value){
        Node current = head;
        Node newNode = new Node(value);

        if ( current == null ){
            head = newNode;
            return head;
        }

        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public Node addToHead(int value){
        Node current = head;
        Node newNode  = new Node(value);

        newNode.next = current;
        head = newNode;
        return head;
    }

    public Node orderedInsert(int value){
        Node newNode = new Node(value);
        Node current = head;
        Node previous = null;

        if ( current == null){
            head = newNode;
            return head;
        }

        while (current != null && current.data < value){
            previous = current;
            current = current.next;
        }

        if (previous == null){
            newNode.next = current;
            head = newNode;
        } else {
            previous.next = newNode;
            newNode.next = current;
        }

        return head;
    }

    public void remove(int value){
        Node current = head;
        Node previous = null;

        while (current.next != null && current.data != value){
            previous = current;
            current = current.next;
        }

        if (previous == null){
            current = current.next;
            head = current;
        } else {
            previous.next = current.next;
        }
    }

    //iterative
    public Node reverse(){
        Node current = head;
        Node previous = null;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
        return previous;

    }

    //recursively
//    public Node reverseRecursive(){
//
//    }

    public boolean contains(int value){
        Node current = head;

        while (current != null){
            if (current.data == value){
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public void clear(){
        head = null;
    }

    public void printList(){
        int item = 0;
        Node node = head;
        while (node != null){
            System.out.println(item + ": " + node.data );
            item++;
            node = node.next;
        }
    }


    public static void main(String[] args){
        LinkedList list = new LinkedList();
//        list.orderedInsert(1);
//        list.orderedInsert(0);
//        list.orderedInsert(100);
//        list.orderedInsert(100);
//        list.orderedInsert(-5);

//        list.addToHead(0);
//        list.addToHead(1);
//        list.addToHead(2);
////        list.reverse();
//        list.printList();
//        list.clear();
//        System.out.println();


        list.addToTail(0);
        list.addToTail(1);
        list.addToTail(2);
        list.reverse();

        list.printList();
        list.clear();

        System.out.println(list.contains(0));

//        LinkedList list2 = new LinkedList();
//        list.addToTail(5);
//        list.addToTail(4);
//        list.addToTail(3);
//        list.addToTail(2);
//        list.addToTail(1);
//        list.printList();

    }
}




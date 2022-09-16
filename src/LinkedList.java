public class LinkedList {
    public Node head;
    public int size;


    public LinkedList() {
        this.head=null;
        this.size=0;
    }

    public Node getHead(){
        return this.head;
    }
    public boolean isEmpty() {
        return this.head==null;
    }

    public int size () {
        return this.size;
    }





    public void insertLast (Node last) {
        if (this.head==null) {
            this.head = last;
        }
        else {
            Node current=this.head;
            for(int i = 0; i<this.size-1; i++) {
                current=current.getNext();
            }
            current.setNext(last);
        }
        this.size++;
    }

    public void insertFirst



    public void displayList() {
        Node current = this.head;
        if (head == null) {
            System.out.println("Empty");
        } else {
            while (current != null) {
                System.out.println(current.getData());
                current = current.getNext();
            }
        }
    }



    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        Node a1 = new Node("Mariela");
        test.displayList();
        test.insertLast(a1);
        test.displayList();
        System.out.println(test.size());
        Node a2 = new Node("Claudio");
        test.insertLast(a2);
        test.displayList();
        System.out.println(test.size());
        Node a3 = new Node("Luis");
        test.insertLast(a3);
        test.displayList();
        System.out.println(test.size());
    }
}

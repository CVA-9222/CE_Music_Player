public class LinkedList {
    public Node head;
    public int size;


    public LinkedList() {
        this.head=null;
        this.size=0;
    }

    public LinkedList(Object data){
        Node newNode= new Node(data);
        this.head=newNode;
        this.size=1;
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





    public void insertLast (Object data) {
        Node newNode= new Node (data);
        if (this.head==null) {
            this.head = newNode;
        }
        else {
            Node current=this.head;
            for(int i = 0; i<this.size-1; i++) {
                current=current.getNext();
            }
            current.setNext(newNode);
        }
        this.size++;
    }

    public void insertFirst (Object data){
        Node newNode= new Node (data);
        newNode.setNext(this.head);
        this.head=newNode;
        this.size++;
    }

    public void insertByIndex (Object data, int index){
        Node newNode= new Node (data);
        Node current = this.head;
        if (index < 0){
            System.out.print("Posición inválida");
        }
        else if (index == size - 1) {
            this.insertLast(data);
        }
        else if (index== 0) {
            this.insertFirst(data);
        }
        else if (index>=size) {
            System.out.print("Posición fuera de rango");
        }

       // for (int i; i<index; i++){
         //   if(i == index-1) {
           //     current=current.getNext();
            //}
              //  this.head = newNode;
           // this.size++;
        //}

    }







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
        LinkedList test1=new LinkedList(6);
        LinkedList test = new LinkedList();
        Node a1 = new Node("Mariela");
        test.displayList();
        test.insertLast(890);
        test.displayList();
        System.out.println(test.size());
        Node a2 = new Node("Claudio");
        test.insertFirst(6);
        test.displayList();
        System.out.println(test.size());
        Node a3 = new Node("Luis");
        test.insertLast(67);
        test.displayList();
        System.out.println(test.size());
        test.insertFirst(456);
        test.displayList();
        System.out.println(test.size());
    }
}

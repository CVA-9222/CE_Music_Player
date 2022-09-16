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
        if (index < 0){
            System.out.println("Index inválido\n");
        }
        else if (index == size - 1) {
            this.insertLast(data);
        }
        else if (index== 0) {
            this.insertFirst(data);
        }
        else if (index>=size) {
            System.out.println("Index fuera de rango\n");
        }
        else{ // En cualquier otro caso
            Node current = this.head; // Node actual es igual a nodo head
            for(int i =0; i<index-1; i++) { // recorrer lista hasta llegar a nodo previo al index deseado
                current = current.getNext(); //iterar hasta obtner nodo deseado
            }
            Node newNode= new Node (data); //Crear nuevo nodo con data dada
            Node temp = current.getNext(); //Almacenar temporalmente siguiente nodo
            newNode.setNext(temp); //Asignar nodo temporal como next del nodo insertado
            current.setNext(newNode); //Asignar nuevo nodo al next del nodo del index-1
           this.size++; //Aumentar tamaño de la lista
        }

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
        LinkedList test = new LinkedList();

        test.insertLast(890);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.insertFirst(6);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.insertLast(67);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.insertFirst(456);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.insertByIndex(800, -5);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.insertByIndex(800, 10);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.insertByIndex(801, 0);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.insertByIndex("Hola", 5);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.insertByIndex("Hola Que Tal", 3);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");
    }
}

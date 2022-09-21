import javax.xml.crypto.Data;
import java.lang.Object;

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

    /**
     * Inserta objeto al final de la lista
     * El nuevo nodo se enlaza al que estaba en última posición anteriormente.
     * @param data Nuevo nodo
     */
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

    /**
     *     Inserta objeto al inicio de la lista
     *     El nuevo nodo se enlaza al que estaba en primera posición anteriormente.
     * @param data Nuevo nodo
     */
    public void insertFirst (Object data){
        Node newNode= new Node (data);
        newNode.setNext(this.head);
        this.head=newNode;
        this.size++;
    }


    /**
     *  Inserta objeto según índice o posición deseada.
     * Se busca la ubicación requerida. El nuevo nodo se enlaza a uno temporal y se asigna el nodo como next al anterior.
     * @param data Nodo nuevo a colocar
     * @param index Posición en la que se ubicará el nuevo nodo
     */
    public void insertByIndex (Object data, int index){
        if (index < 0){
            System.out.println("Index inválido\n");
        }
        else if (index == size) {
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

    /**
     * Obtiene el valor del primer elemento de la lista
     * @return el valor del primer elemento de la lista
     * @throws Exception
     */
    public Node getFirst () throws Exception{
        if (head == null) {
            throw new Exception("Lista vacía, no hay primer elemento");
            }
        else {
            return head;
            }
    }

    /**
     *  Recorre la lista hasta la posición final.
     * @return retorna el valor del nodo.
     * @throws Exception  Crea una excepción para lista vacía.
     */
    public Node getLast () throws Exception{
        if (head == null) {
            throw new Exception("Lista vacía, no hay último elemento");
        }
        else {
            Node current = this.head;
            for (int i = 0; i < size-1; i++) {
                current = current.getNext();
            }
            return current;
        }
    }


    public void removeFirst(){
        Node current = this.head;
            if (this.head ==null){
                System.out.println("Lista vacía, no se puede eliminar\n");
            }
            else {
                this.head = this.head.getNext();
                this.size--;
            }
    }

    /**
     *Busca el nodo hasta el anterior al nodo final y elimina la referencia del nodo
     */
    public void removeLast(){
        Node current = this.head;
        if (this.head ==null){
            System.out.println("Lista vacía, no se puede eliminar\n");
        }
        else  {
            for (int i = 0; i < size-2; i++) {
                current = current.getNext();
            }
            current.setNext(null);
            this.size--;
            }
    }

    public void removeByIndex(int index){
        if (index < 0){
            System.out.println("Index inválido\n");
        }
        else if (index == size-1) {
            this.removeLast();
        }
        else if (index== 0) {
            this.removeFirst();
        }
        else if (index>=size) {
            System.out.println("Index fuera de rango\n");
        }
        else{
            Node current = this.head;
            for(int i =0; i<index-1; i++) {
                current = current.getNext();
            }
            Node next=current.getNext();
            current.setNext(next.getNext());
            size--;
        }

    }


    public Node getByIndex(int index) throws Exception{
        if (index<=size-1 && index>=0){
            int cont = 0;
            Node current = this.head;
            while(index!= cont){
                cont ++;
                current = current.getNext();
            }
            return current;
        }else {
            throw new Exception("Valor inexistente en la lista.");
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
        try{
            System.out.println("First Node: "+test.getFirst()+"\n");
            test.getFirst();
        }
        catch (Exception e){
        }
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

        test.insertByIndex(78, 0);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.insertByIndex("100", 5);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.insertByIndex("Hola Que Tal", 4);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");
        try{
            System.out.println("First Node: "+test.getFirst().getData()+"\n");
            test.getFirst();
        }
        catch (Exception e){
        }
        try{
            System.out.println("Last Node: "+test.getLast().getData()+"\n");
            test.getLast();
            }
        catch (Exception e){
            }
        test.removeFirst();
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.removeLast();
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.removeByIndex(-4);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");


        test.removeByIndex(10);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");

        test.removeByIndex(2);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");
        try{
            System.out.println("Data Index: "+test.getByIndex(3).getData()+"\n");
            test.getByIndex(3);
        }
        catch (Exception e){
        }

    }
}

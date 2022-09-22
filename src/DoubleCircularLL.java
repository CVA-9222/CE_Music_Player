public class DoubleCircularLL{
    private DoubleNode head;
    private DoubleNode last;
    private int size;

    public DoubleCircularLL() {
        DoubleNode newDoubleNode = new DoubleNode();
        this.head= newDoubleNode;
        this.last= newDoubleNode;
        this.head.setNext(this.last);
        this.last.setPrev(this.head);
        this.head.setPrev(this.last);
        this.last.setNext(this.head);
        this.size=0;
    }
    public DoubleCircularLL(Object data){
        DoubleNode doubleNode= new DoubleNode(data);
        this.head= doubleNode;
        this.last= doubleNode;
        this.head.setNext(this.last);
        this.head.setPrev(this.last);
        this.last.setNext(this.head);
        this.last.setPrev(this.head);
        this.size=1;
    }

    public DoubleNode getHead() {
        return head;
    }
    public void setHead(DoubleNode head) {
        this.head = head;
    }
    public DoubleNode getTail() {
        return last;
    }
    public void setTail(DoubleNode last) {
        this.last = last;
    }
    public int size() {
        return size;
    }


    public void insertFirst (Object data){
        DoubleNode newDoubleNode = new DoubleNode(data);
        if(size==0) {
            this.head= newDoubleNode;
            this.last= newDoubleNode;
            this.head.setNext(this.last);
            this.head.setPrev(this.last);
            this.last.setNext(this.head);
            this.last.setPrev(this.head);
        }
        else{
            newDoubleNode.setNext(this.head);
            this.head.setPrev(newDoubleNode);
            this.head=newDoubleNode;
            this.last.setNext(newDoubleNode);
            this.head.setPrev(this.last);

        }
        this.size++;
    }


        public void insertLast(Object data){
        DoubleNode newDoubleNode = new DoubleNode(data);
        if(size==0) {
            this.head= newDoubleNode;
            this.last= newDoubleNode;
            this.head.setNext(this.last);
            this.head.setPrev(this.last);
            this.last.setNext(this.head);
            this.last.setPrev(this.head);
        }
        else{
            this.last.setNext(newDoubleNode);
            this.last=newDoubleNode;
            this.head.setPrev(newDoubleNode);
            this.last.setNext(this.head);
        }
        this.size++;
    }


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
        else{
            DoubleNode current = this.head;
            for(int i =0; i<index-1; i++) {
                current = current.getNext();
            }
            DoubleNode newDoubleNode= new DoubleNode (data);
            DoubleNode temp = current.getNext(); //Almacenar temporalmente siguiente nodo
            newDoubleNode.setNext(newDoubleNode.getNext()); //Asignar el next del nodo insertado al siguiente
            newDoubleNode.setNext(temp); //Asignar nodo temporal como next del nodo insertado
            temp.setPrev(newDoubleNode); //Asignar el prev del nodo temporal como el nodo insertado
            current.setNext(newDoubleNode); //Asignar nuevo nodo al next del nodo del index-1
            current= newDoubleNode;
            current.setPrev(newDoubleNode.getPrev());
            this.size++; //Aumentar tamaño de la lista
            }
    }



    /**
     * Obtiene el valor del primer elemento de la lista
     * @return el valor del primer elemento de la lista
     * @throws Exception
     */
    public DoubleNode getFirst () throws Exception{
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
    public DoubleNode getLast () throws Exception{
        if (head == null) {
            throw new Exception("Lista vacía, no hay último elemento");
        }
        else {
            DoubleNode current = this.head;
            for (int i = 0; i < size-1; i++) {
                current = current.getNext();
            }
            return current;
        }
    }


    public void removeFirst(){
        DoubleNode current = this.head;
        if (this.head ==null){
            System.out.println("Lista vacía, no se puede eliminar\n");
        }
        else {
            this.head = this.head.getNext();
            this.head.setPrev(this.last);
            this.last.setNext(this.head);
            this.size--;
        }
    }

    public void removeLast(){
        DoubleNode current = this.head;
        if (this.head ==null){
            System.out.println("Lista vacía, no se puede eliminar\n");
        }
        else  {
            for (int i = 0; i < size-2; i++) {
                current = current.getNext();
            }
            current.setNext(this.head);
            this.head.setPrev(current);
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
            DoubleNode current = this.head;
            for(int i =0; i<index-1; i++) {
                current = current.getNext();
            }
            DoubleNode next=current.getNext();
            DoubleNode prev=current.getPrev();
            current.setNext(next.getNext());
            current.setPrev(next.getPrev());
            size--;
        }

    }

    public DoubleNode getByIndex(int index) throws Exception{
        if (index<=size-1 && index>=0){
            int cont = 0;
            DoubleNode current = this.head;
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
        DoubleNode current = this.head;
        if (this.head.getData() == null) {
            System.out.println("Empty");
        } else {
            for(int i=0; i<size; i++){
                System.out.println(current.getData());
                current = current.getNext();
            }
        }
    }



    public static void main(String[] args) {
        DoubleCircularLL test = new DoubleCircularLL();
        test.displayList();
        test.insertLast(891);
        test.insertLast(892);
        test.insertLast(893);
        test.insertFirst(890);
        test.insertLast(894);
        test.insertLast(895);
        test.insertFirst(889);
        test.insertByIndex(340, 2);
        test.insertByIndex(340, 0);
        test.insertByIndex(340, 10);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");
        try{
            System.out.println("\nFirst DoubleNode: "+test.getFirst().getData()+"\n");
            test.getFirst();
        }
        catch (Exception e){
        }
        try{
            System.out.println("Last DoubleNode: "+test.getLast().getData()+"\n");
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
        test.removeByIndex(2);
        test.displayList();
        System.out.println("List Size: "+test.size()+"\n");
        try{
            System.out.println("\nGet By Index: "+test.getByIndex(10).getData()+"\n");
            test.getByIndex(10);
        }
        catch (Exception e){
        }
        try{
            System.out.println("Print de Dato del Head: "+ test.getLast().getNext().getData());
        }
        catch (Exception e){
        }
        try{
            System.out.println("Print de Dato del Last: "+ test.getHead().getPrev().getData());
        }
        catch (Exception e){
        }
    }
}

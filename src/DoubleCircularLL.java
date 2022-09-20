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
    public DoubleNode getLast() {
        return last;
    }
    public void setLast(DoubleNode last) {
        this.last = last;
    }
    public int size() {
        return size;
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
            this.last = newDoubleNode;
            this.head.setPrev(newDoubleNode);
            this.last.setNext(this.head);
        }
        this.size++;
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
        test.insertLast(894);
        test.insertLast(895);
        test.displayList();
    }

}



public class DoubleCircularLL extends LinkedList{
    private DoubleNode head;
    private DoubleNode last;

    public DoubleCircularLL() {
        this.head=null;
        this.last=null;
        this.size=0;
    }

    public DoubleCircularLL(Object data){
        DoubleNode doubleNode= new DoubleNode(data);
        this.head= doubleNode;
        this.last= doubleNode;
        this.size=1;
        this.head.setNext(this.last);
        this.last.setPrev(this.head);
        this.head.setPrev(this.last);
        this.last.setNext(this.head);

    }

}

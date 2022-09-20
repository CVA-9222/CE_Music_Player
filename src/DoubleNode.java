public class DoubleNode {

    private DoubleNode next;

    private DoubleNode prev;

    private Object data;


    public DoubleNode(){
        this.next = null;
        this.prev = null;
        this.data = null;
    }
    public DoubleNode(Object data) {
        this.next = null;
        this.prev = null;
        this.data = data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }
    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}

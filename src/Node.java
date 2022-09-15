public class Node {
    public Object data;
    public Node next;
    public Node
    //Para una lista doblemente enlazada se debe crear otro nodo que en lugar de next sea previuos. MMM

    public Node(Object data) {
        this.next = null;
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }
}
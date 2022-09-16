

public class DoubleNode extends Node {

    private Node prev;

    public DoubleNode(Object data) {
        super(data);
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}


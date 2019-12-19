
public class Node {
    private Node prev;
    private Integer value;

    public Node(Integer v){
        value = v;
    }

    public Node getPrev(){
        return prev;
    }

    public void setPrev(Node prev){
        this.prev = prev;
    }

    public Integer getValue(){
        return value;
    }
    public void setValue(Integer value){
        this.value = value;
    }
}

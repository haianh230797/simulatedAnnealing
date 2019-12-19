import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Branch {
    private ArrayList<Node> nodes = new ArrayList<>();

    public void add(Node node) {
        nodes.add(node);
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Node node : nodes) {
            string.append(node.getValue()).append(" ");
        }
        return string.toString();
    }
    public Set<Integer> toSet(){
        Set<Integer> set = new HashSet<>();
        for( Node node: nodes){
            set.add(node.getValue());
        }
        return set;
    }

}

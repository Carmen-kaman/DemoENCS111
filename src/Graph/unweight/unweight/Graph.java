package Graph.unweight.unweight;

import java.util.HashMap;
import java.util.Map;

public class Graph {
//    LinkedList<Node> nodes = new LinkedList<>();
    Map<String, Node> nodes = new HashMap<>();

    public Node getNode(String name){
        return nodes.get(name);
    }

    public Node getOrCtrateNode (String name){
        Node node = nodes.get(name);
        if (node == null){
            node = new Node(name);
            nodes.put(name, node);
        }
        return node;
    }
}

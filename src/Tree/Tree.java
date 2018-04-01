package Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    Map<String, Node> nodes = new HashMap<>();
    public Node getOrCreatNode (String name){
        Node node = nodes.get(name);
        if (node != null){
            return node;
        }
        node = new Node(name);
        nodes.put(name, node);
        return node;
    }


    public void preOrderTraverse(){
       preOrderVisit(root);
    }

    private void preOrderVisit (Node node){
        if (node == null){
            return;
        }
        System.out.println(node.getName());
        preOrderVisit(node.getLeft());
        preOrderVisit(node.getRight());
    }

    //private List<Node> list = new List<Node>();

    public List<Node> preOrderList(){
        LinkedList<Node> nodes = new LinkedList<>();
        preOrderCellect(root, nodes);
        return nodes;
    }

    private void preOrderCellect(Node node, List<Node> list){
        if (node == null){
            return;
        }
//        collector.add(node); collector 是在哪里定义了？
//        preOrderCellect(node.getLeft(),collector);
//        preOrderCellect(node.getRight(),collector);
    }
    public  void preOrderTraverse2(){

    }
}

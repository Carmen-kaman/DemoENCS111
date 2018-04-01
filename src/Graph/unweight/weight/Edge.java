package Graph.unweight.weight;

//有向有重量图需要 from to
//无向有重量图

public class Edge {
    Node n1;
    Node n2;
    int value;

    public Node opposite(Node source) {
//        return n1 == source ? n2:n1;
        if (n1 == source) {
            return n2;
        }
        if (n2 == source) {
            return n1;
        }
        return null;
    }
}

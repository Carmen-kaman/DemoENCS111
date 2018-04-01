package Graph.unweight.weight;

import java.util.LinkedList;

public class Drive {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");

//        Edge edge = new Edge();
//        edge.n1 = a;
//        edge.n2 = b;
//        a.edges.add(edge);
//        b.edges.add(edge);
        Edge edge = a.connect(b,true);
        edge.value = 10;


        LinkedList<Edge> edges = a.edges;
        for (Edge edge1: edges) {
            Node opposite = edge1.opposite(b);
        }
    }
}
// A B
// A C
// D A

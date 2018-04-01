package Graph.unweight.unweight;

import Graph.unweight.Graph;

import java.io.File;
import java.util.Scanner;

public class Drive {
    public static void main(String[] args) throws Exception{
//        Node a = new Node("A");
//        Node b = new Node("B");
//
//        a.addNode(b, true);

//        Graph graph = new Graph();
//        Node a = graph.getOrCtrateNode("A");
//        Node b = graph.getOrCtrateNode("B");
//        a.addNode(b,true);

        Scanner scanner = new Scanner (new File("data/g1.txt"));

        Graph graph = new Graph();

        while (scanner.hasNext()){
            String name1 = scanner.next();
            String name2 = scanner.next();
            Node node1 = graph.getOrCtrateNode(name1);
            Node node2 = graph.getOrCtrateNode(name2);
            node1.addNode(node2,true);
        }

       System.out.println("");

    }
}

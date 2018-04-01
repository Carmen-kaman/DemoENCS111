package Tree;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("data/tree/t2.txt"));
        Tree tree = new Tree();
        while ( scanner.hasNext()){
           String parentName = scanner.next();
           String leftName = scanner.next();
           String rightNme = scanner.next();

           Node parent = tree.getOrCreatNode(parentName);
           if (tree.getRoot()  == null){
               tree.setRoot(parent);
           }

           if (!leftName.equals("0")){
               Node left = tree.getOrCreatNode(leftName);
             //  parent.setLeft(left,ture);
           }

           if (!rightNme.equals("0")){
               Node right = tree.getOrCreatNode(rightNme);
              // parent.setParent(right,ture);
           }
        }
        tree.preOrderTraverse();
        tree.preOrderTraverse2();
        List<Node> nodes = tree.preOrderList();
        for (Node node : nodes){
            System.out.print(node.getName());
        }

    }
}

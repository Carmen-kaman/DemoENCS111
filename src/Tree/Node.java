package Tree;
public class Node {
    private  String name;

    public Node(String name){
        this.name = name;
    }

    private Node left;
    private Node right;
    private Node parent;

    public String getName() {
        return name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node node ) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void preOrderVisit(){
        System.out.println(name);
        if (left != null){
            left.preOrderVisit();
        }
        if (right != null){
            right.preOrderVisit();
        }

    }
}

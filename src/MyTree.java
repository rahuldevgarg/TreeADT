class Node{
    private int data;
    private Node left;
   private Node right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
public class MyTree {
    public Node newNode(int data){
        Node N=new Node();
        N.setData(data);
        return N;
    }
    public void postOrderDisplay(Node root){
        if(root==null){
            return;
        }
        postOrderDisplay(root.getLeft());
        postOrderDisplay(root.getRight());
        System.out.print(" "+root.getData());
    }
    public void preOrderDisplay(Node root){
        if(root==null){
            return;
        }
        System.out.print(" "+root.getData());
        postOrderDisplay(root.getLeft());
        postOrderDisplay(root.getRight());

    }
    public void inOrderDisplay(Node root){
        if(root==null){
            return;
        }

        postOrderDisplay(root.getLeft());
        System.out.print(" "+root.getData());
        postOrderDisplay(root.getRight());

    }
    public static void main(String[] args) {
        MyTree t= new MyTree();
        Node root = t.newNode(10);
        root.setLeft(t.newNode(20));
        root.setRight(t.newNode(30));
        root.getLeft().setLeft(t.newNode(40));
        root.getLeft().setRight(t.newNode(50));
        root.getRight().setLeft(t.newNode(60));
        System.out.println("--------PostOrderDisplay---------");
        t.postOrderDisplay(root);
        System.out.println();
        System.out.println("--------PreOrderDisplay---------");
        t.preOrderDisplay(root);
        System.out.println();
        System.out.println("--------InOrderDisplay---------");
        t.inOrderDisplay(root);

    }
}

public class NodeClient {

    public static void main(String[] args) {
        Node n1 = new Node(20,null);
        Node n2 = new Node(21,n1);
        Node n3 = new Node(31,n2);
        System.out.println(n1.getData());
        System.out.println(n2.getData());



    }
}

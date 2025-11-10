public class LL{

    private Node Head;
    private Node Tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insert (int value){
        Node node = new Node(value);

        node.next = Head;
        Head = node;


        if (Tail == null) {
            Tail = Head;
        }

        size++;
    }

    public void Display(){
       Node temp = Head;
       
       while (temp != null){    
        System.out.print(temp.value + " -> ");
        temp = temp.next;
       }
       System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

}
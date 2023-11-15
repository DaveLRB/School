public class Node <T>{

    T value;
    Node<T> nest;

    public Node(T value, Node<T> nest) {
        this.value = value;
        this.nest = nest;
    }
}



public class List<T> {

    Node<T> root;

    public void add(T value) {

        Node<T> node = new Node<>(value);

        if (root == null) {
            root = node;
        } else {
            Node<T> tempNode = root;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }

    }

    public void add(T value, int index) {
        Node<T> node = new Node<>(value);
        Node<T> prevNode=root;

        for(int i = 0 ; i< index-1;i++){
            prevNode=prevNode.next;
        }
        node.next=prevNode.next;
        prevNode.next=node;
    }


    public Node<T> get(int index) {
        Node<T> prevNode=root;

        for(int i = 0 ; i< index;i++){
            prevNode=prevNode.next;

        }
        return prevNode;
    }

    public void delete(int index) {
        Node<T> prevNode = root;
        if (index == 0) {
            if (root.next == null) {
                root = null;
            } else {
                root = root.next;
            }
        } else {
            for (int i = 0; i < index - 1; i++) {
                prevNode = prevNode.next;
            }
            prevNode.next = prevNode.next.next;

        }
    }
}



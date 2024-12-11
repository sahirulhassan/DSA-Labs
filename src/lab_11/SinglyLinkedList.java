package lab_11;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void insert(int pos, int data) {
        if (pos < 0) {
            throw new IllegalArgumentException("Enter a valid position to insert a value.");
        } else if (pos == 0) {
            prepend(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.getNext();
            }

            if (current == null) {
                throw new IllegalArgumentException("Position is out of bounds.");
            }

            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        Node current = head;
        while (current != null) {
            temp.append(current.getData()).append(" ");
            current = current.getNext();
        }
        temp.append("null");
        return temp.toString();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        System.out.println(list);
        list.prepend(0);
        System.out.println(list);
        list.insert(0,0);
        System.out.println(list);
    }
}

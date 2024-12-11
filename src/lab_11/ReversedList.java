package lab_11;

public class ReversedList {
    public static void listReverser(SinglyLinkedList list) {
        Node previous = null;
        Node current = list.getHead();
        Node next;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        list.setHead(previous);
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        System.out.println(list);

        listReverser(list);
        System.out.println(list);
    }
}
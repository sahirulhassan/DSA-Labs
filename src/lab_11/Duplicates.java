package lab_11;

import java.util.ArrayList;

public class Duplicates {
    public static void duplicatesFinder(SinglyLinkedList list) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        Node current = list.getHead();
        while (current != null) {
            Node temp = current.getNext();
            while (temp != null) {
                if (current.getData() == temp.getData() && !duplicates.contains(current.getData())) {
                    duplicates.add(current.getData());
                    break;
                }
                temp = temp.getNext();
            }
            current = current.getNext();
        }
        System.out.println("Duplicates: " + duplicates);
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(2);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(6);
        duplicatesFinder(list);
    }
}

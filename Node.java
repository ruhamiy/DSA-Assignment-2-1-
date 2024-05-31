package IndexAtPosition;

public class Node {
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    }
    static class LinkedList {
        Node head;

        public void insertAtPos(int data, int pos) {
            Node newNode = new Node(data);
            if (pos==1) {
                newNode.next = head;
                head= newNode;
                return;
            }
            Node current = head;
            int count = 1;
            while (current!= null && count < pos-1) {
                current = current.next;
                count ++;
            }
            if (current == null) {
                throw new IndexOutOfBoundsException("position out of bounds");
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
// to check the implementation above
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.insertAtPos(1, 1);
            list.insertAtPos(2, 2);
            list.insertAtPos(3, 1);
            list.insertAtPos(4, 2);
            list.printList();
        }
    }
}

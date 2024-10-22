package LinkList;

public class InsertionSLL {

    private ListNode head;

    private static class ListNode {
        private int data; // Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void Display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public int length() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /*
     * public void insertFirst(int value) {
     * ListNode newNode = new ListNode(value);
     * newNode.next = head;
     * head = newNode;
     * }
     */

    public void insert(int position, int value) {
        ListNode node = new ListNode(value);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    /*
     * public void insertLast(int value) {
     * ListNode newNode = new ListNode(value);
     * if (head == null) {
     * head = newNode;
     * return;
     * }
     * ListNode current = head;
     * while (null != current.next) {
     * current = current.next;
     * }
     * current.next = newNode;
     * }
     */

    public static void main(String[] args) {
        InsertionSLL sll = new InsertionSLL();

        // sll.insertFirst(20);
        // sll.insertFirst(15);
        // sll.insertFirst(10);
        // sll.insertFirst(5);

        sll.insert(1, 4);
        sll.insert(2, 5);
        sll.insert(1, 2);
        sll.insert(2, 3);
        sll.insert(5, 10);

        // sll.insertLast(20);
        // sll.insertLast(46);
        // sll.insertLast(59);

        sll.Display();
        System.out.println("The length is " + sll.length());

    }
}
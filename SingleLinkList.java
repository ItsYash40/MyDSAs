package LinkList;

public class SingleLinkList {

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

    public static void main(String[] args) {
        SingleLinkList sll = new SingleLinkList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(4);
        ListNode forth = new ListNode(9);

        // Now we will connect them togather in a form of chain

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        sll.Display();
        System.out.println("The length is " + sll.length());
    }

}

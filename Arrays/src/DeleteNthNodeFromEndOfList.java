public class DeleteNthNodeFromEndOfList {

    public static void main(String[] args) {

    }


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode pointerHead = head;
        ListNode pointerLast = head;

        for (int i = 0; i < n; i++) {

            pointerLast = pointerLast.next;
        }
        if(pointerLast == null) {

            pointerHead = pointerHead.next;

            return pointerHead.next;
        }

        while(pointerLast.next != null) {

            pointerHead = pointerHead.next;
            pointerLast = pointerLast.next;
        }

        return pointerHead;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {


    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ArrayList<ListNode> a) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < a.size(); i++) {

            ListNode curr = a.get(i);

            while(curr != null) {

                minHeap.add(curr.val);

                curr = curr.next;
            }
        }

        ListNode result = new ListNode(-1);
        ListNode curr = result;

        while(!minHeap.isEmpty()) {

             curr.next = new ListNode(minHeap.poll());
             curr = curr.next;
        }

        return result.next;
    }

}

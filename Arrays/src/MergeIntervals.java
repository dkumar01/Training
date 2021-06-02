import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

/**
 *
 * Given a collection of intervals, merge all overlapping intervals.
 *
 * For example:
 *
 * Given [1,3],[2,6],[8,10],[15,18],
 *
 * return [1,6],[8,10],[15,18].
 *
 * Make sure the returned intervals are sorted.
 *
 * Note: More Efficient Solution Uses Stack. Most efficient Solution uses in place operations
 */
public class MergeIntervals {

    public static void main(String[] args) {

        MergeIntervals obj = new MergeIntervals();
    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        Comparator<Interval> intervalComparator = Comparator.comparingInt(i -> i.start);
        intervals.sort(intervalComparator);
        Stack<Interval> intervalStack = new Stack<>();
        intervalStack.push(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {

            Interval curr = intervals.get(i);
            if(intervalStack.peek().end >= curr.start) {

                if(intervalStack.peek().end > curr.end) {
                    continue;
                }
                else {

                    intervalStack.peek().end = curr.end;
                }
            }
            else {

                intervalStack.push(curr);
            }
        }

        intervals = new ArrayList<>();
        while (!intervalStack.empty()) {

            intervals.add(0, intervalStack.pop());
        }

        return intervals;
    }

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}

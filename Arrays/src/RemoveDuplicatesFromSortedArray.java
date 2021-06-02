import java.util.ArrayList;

/**
 * Remove duplicates from Sorted Array
 * Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
    }

    public int removeDuplicates(ArrayList<Integer> a) {

        if(a.size() == 0 || a.size() == 1) {

            return 0;
        }
        for (int i = 1; i < a.size(); i++) {

            int prev = a.get(i - 1);
            int curr = a.get(i);

            if(curr == prev){

                a.remove(i - 1);
                i --;
            }
        }

        return a.size();
    }
}

import java.util.ArrayList;
import java.util.PriorityQueue;

/*
Sorted Squared Array
https://leetcode.com/problems/squares-of-a-sorted-array/
https://www.algoexpert.io/questions/Sorted%20Squared%20Array
*/
public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {

        PriorityQueue<Integer> numQueue = new PriorityQueue<>();
        int[] returnArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            numQueue.add(nums[i] * nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            returnArray[i] = numQueue.poll();
        }

        return returnArray;
    }
}

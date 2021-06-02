import java.util.HashMap;

public class TwoNumberSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numberIndexMap = new HashMap<>();
        Integer compliment;

        for (int i = 0; i < nums.length; i++) {

            compliment = numberIndexMap.get(target - nums[i]);

            if(compliment != null) {

                return new int[] {compliment, i};
            }
            numberIndexMap.put(nums[i], i);
            continue;

        }

        return new int[] {};
    }

    public static void main(String[] args) {

    }
}

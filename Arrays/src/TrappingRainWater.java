public class TrappingRainWater {

    public int trap(int[] height) {

        if(height.length <= 3) {

            return 0;
        }
        int trappedRainWater = 0;
        int maxPrev = 0;
        int prev;
        int curr;
        int next;

        for (int i = 0; i < height.length - 2; i++) {

            prev = height[i];
            curr = height[i + 1];
            next = height[i + 2];
            if(prev > 0 && next > 0) {

                if(Math.min(prev, next) - curr <= 0) {

                    continue;
                }
                else {

                    trappedRainWater += Math.min(prev, next) - curr;
                }
            }
        }

        return trappedRainWater;
    }
}

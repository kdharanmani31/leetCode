class Solution {
    public void moveZeroes(int[] nums) {
        
        int nonZeroPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroPos] = nums[i];
                nonZeroPos++;
            }
        }

        while (nonZeroPos < nums.length) {
            nums[nonZeroPos] = 0;
            nonZeroPos++;
        }
    }
}


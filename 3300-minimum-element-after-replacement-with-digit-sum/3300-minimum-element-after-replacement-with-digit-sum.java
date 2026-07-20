class Solution {
    public int minElement(int[] nums) {
        int min = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int num = nums[i];

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (i == 0 || sum < min) {
                min = sum;
            }
        }

        return min;
    }
}
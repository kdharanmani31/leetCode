public class Solution {

    
    public int findNumbers(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    
    private boolean hasEvenDigits(int num) {
        num = Math.abs(num); 
        int digitCount = 0;

        
        if (num == 0) {
            digitCount = 1;
        } else {
            while (num > 0) {
                digitCount++;
                num /= 10;
            }
        }

        return digitCount % 2 == 0;
    }

    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(sol.findNumbers(nums)); 
    }
}
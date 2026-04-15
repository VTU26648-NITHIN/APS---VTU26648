class Solution {
    public void moveZeroes(int[] nums) {
        // lastNonZeroFoundAt tracks the position for the next non-zero element
        for (int lastNonZeroFoundAt = 0, i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap elements
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = temp;
                
                lastNonZeroFoundAt++;
            }
        }
    }
}
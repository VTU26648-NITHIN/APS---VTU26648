class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;  // points to the position where next non-zero element should go
        
        // Step 1: Move all non-zero elements to the front (maintain order)
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Swap non-zero element to the left pointer position
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                
                left++;  // move left pointer forward for next non-zero
            }
        }
        // After this loop, all zeros are automatically pushed to the end
    }
}
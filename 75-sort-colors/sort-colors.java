class Solution {
    public void sortColors(int[] nums) {
        int low = 0;          // pointer for next position to place 0
        int mid = 0;          // current element we're examining
        int high = nums.length - 1;  // pointer for next position to place 2
        
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:  // red → swap with low, move both pointers
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                    
                case 1:  // white → already in correct region, just move mid
                    mid++;
                    break;
                    
                case 2:  // blue → swap with high, move high (mid stays!)
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
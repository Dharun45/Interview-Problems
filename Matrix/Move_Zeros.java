class Move_Zeros {
    public void moveZeroes(int[] nums) {
        int left = 0;

        // Use Two pointer
        for(int right = 0; right < nums.length; right++) {
            if(nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            //Move zero to last
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        //For 0th condition (base val)
        while(index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
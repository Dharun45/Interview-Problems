class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;  //Atmost twice
        //If their len <2 return it
        if(nums.length <= 2) {
            return nums.length; //Len always > 2
        }

        int write = k;  //Start with 2nd idx

        for(int read = k; read < nums.length; read++) {
            if(nums[read] != nums[write - k]) {
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }
}
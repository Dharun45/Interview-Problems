class Solution {
    public int removeElement(int nums[], int val) 
    {
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}

//[1,2,,4,5,_,_] val = 3

//[1,2,4,5,_,_]  val = 2 Same values are remove from arr
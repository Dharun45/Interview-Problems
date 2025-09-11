class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> seen = new HashSet<Integer>();

       for(int i : nums) {
        if(seen.contains(i)) {
            //Contains used to check if ele is Present in set
            return true;
        }
        //Add the remaining val
        seen.add(i);
       }
       return false;
    }
}
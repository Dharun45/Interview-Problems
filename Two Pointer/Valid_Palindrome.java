class Solution {
    public static boolean isPalindrome(String s) {
        String ans = s.toLowerCase();

        // remove unwanted char
        ans = ans.replaceAll("[^a-z0-9]" , "");

        // use two pointer because check left to right end
        int i = 0 , j = ans.length() - 1;

        while(i < j) {
            // 0 to nth end 
            if(ans.charAt(i) != ans.charAt(j)) {
                return false;
            }
            i++;
            j--;    //traverse loop
        }
        return true;
    }
}
import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] str) 
    {
        String ans = "";
        Arrays.sort(str);

        // Take the Start and end index 
        String first = str[0];
        String last = str[str.length - 1];

        for(int i = 0; i < first.length(); i++) {
            if(first.charAt(i) == last.charAt(i)) {
                ans += first.charAt(i);
            }
            else {
                break;
            }
        }

        return ans;
    }
}
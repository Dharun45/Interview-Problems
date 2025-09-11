import java.util.Arrays;
class commanPrefix {
    public String longestCommonPrefix(String[] str) 
    {
        String ans = "";
        Arrays.sort(str);

        // Declare start and end pos of arr
        String first = str[0];
        String last = str[str.length - 1];

        for(int i = 0; i < first.length(); i++)
        {
            // Iterate from left to right
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
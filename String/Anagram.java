class RevStr {
    public void reverseString(char[] s) {
        // Decalre pointer var
        int left = 0 , right = s.length - 1;

        // Use two pointer
        while(left < right) {
            // Swapping cond
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
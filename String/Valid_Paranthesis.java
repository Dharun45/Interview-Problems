class Anagram {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length()) {
            return false;
        }
        
        //To keep track char from 1st to last
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        //To check freq should not equal to '0'
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
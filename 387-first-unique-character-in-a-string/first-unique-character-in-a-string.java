class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Count frequency of each character (only 'a' to 'z')
        int[] count = new int[26];
        
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Step 2: Find the first character with frequency == 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
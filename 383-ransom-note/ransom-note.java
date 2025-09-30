class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] count = new int[26];
        
        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Check ransomNote against magazine
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;  // Not enough letters
            }
            count[c - 'a']--; // Use the letter
        }
        
        return true; 
    }
}
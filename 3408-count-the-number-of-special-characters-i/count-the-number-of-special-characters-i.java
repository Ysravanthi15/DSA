class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] l = new boolean[26];
        boolean[] u = new boolean[26];

        for (char ch : word.toCharArray()) {

            if (Character.isLowerCase(ch)) {
                l[ch - 'a'] = true;
            } else {
                u[ch - 'A'] = true;
            }
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (l[i] && u[i]) {
                count++;
            }
        }

        return count;
    }
}
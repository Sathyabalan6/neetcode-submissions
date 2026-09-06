class Solution {
    public boolean isAnagram(String s, String t) {
        // Quick check: Anagrams must be equal in length
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        // If any frequency is non-zero, they are not anagrams
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
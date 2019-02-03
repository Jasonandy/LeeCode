package cn.ucaner.leecode.cspiration;

public class _242_ValidAnagram {
    /**
     * 242. Valid Anagram
     * For example,
     s = "anagram", t = "nagaram", return true.
     s = "rat", t = "car", return false.

     time : O(m + n) = O(n)
     space : O(1)

     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int num : count) {
            if (num != 0) return false;
        }
        return true;
    }
}

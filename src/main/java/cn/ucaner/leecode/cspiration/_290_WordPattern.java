package cn.ucaner.leecode.cspiration;

import java.util.HashMap;

public class _290_WordPattern {
    /**
     * 290. Word Pattern
     Examples:
     pattern = "abba", str = "dog cat cat dog" should return true.
     pattern = "abba", str = "dog cat cat fish" should return false.
     pattern = "aaaa", str = "dog cat cat dog" should return false.
     pattern = "abba", str = "dog dog dog dog" should return false.

     time : O(n^2) space : O(1) / O(n)

     * @param pattern
     * @param str
     * @return
     */
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c).equals(arr[i])) continue;
                else return false;
            } else {
                if (!map.containsValue(arr[i])) {
                    map.put(c, arr[i]);
                } else return false;
            }
        }

        return true;
    }
}

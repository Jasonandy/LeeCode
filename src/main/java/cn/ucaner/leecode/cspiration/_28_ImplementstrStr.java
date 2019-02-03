package cn.ucaner.leecode.cspiration;

public class _28_ImplementstrStr {
    /**
     * time : O(m * n)
     * space : O(1)
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
             if (i + needle.length() > haystack.length()) {
                 break;
             }
            for (int j = 0; j < needle.length(); j++) {
                 if (haystack.charAt(i + j) != needle.charAt(j)) {
                     break;
                 }
                 if (j == needle.length() - 1) {
                     return i;
                 }
            }
        }

        return -1;
    }
}

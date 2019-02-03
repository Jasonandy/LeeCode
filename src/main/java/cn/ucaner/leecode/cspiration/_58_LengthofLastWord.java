package cn.ucaner.leecode.cspiration;

public class _58_LengthofLastWord {
    /**
     * 58. Length of Last Word
     * For example,
     Given s = "Hello World",
     return 5.

     time : O(n)
     space : O(n)

     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        if (strings.length == 0) {
            return 0;
        }
        return strings[strings.length - 1].length();
    }
}

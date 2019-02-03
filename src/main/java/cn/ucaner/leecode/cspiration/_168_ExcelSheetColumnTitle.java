package cn.ucaner.leecode.cspiration;

public class _168_ExcelSheetColumnTitle {
    /**
     * 168. Excel Sheet Column Title
     * 1 -> A
     2 -> B
     3 -> C
     ...
     26 -> Z
     27 -> AA
     28 -> AB

     time : O(logn)
     space : O(n)

     * @param n
     * @return
     */
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char)('A' + n % 26));
            n /= 26;
        }
        return sb.reverse().toString();
    }
}

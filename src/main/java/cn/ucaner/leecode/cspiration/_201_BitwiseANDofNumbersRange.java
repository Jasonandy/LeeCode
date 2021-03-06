package cn.ucaner.leecode.cspiration;

public class _201_BitwiseANDofNumbersRange {

    /**
     * 201. Bitwise AND of Numbers Range
     * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

     For example, given the range [5, 7], you should return 4.

     time : O(logn)
     space : O(1)


     * @param m
     * @param n
     * @return
     */

    public int rangeBitwiseAnd(int m, int n) {
        int offset = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            offset++;
        }
        return m << offset;
    }
}

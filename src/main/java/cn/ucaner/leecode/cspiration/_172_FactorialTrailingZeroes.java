package cn.ucaner.leecode.cspiration;

public class _172_FactorialTrailingZeroes {
    /**
     * 172. Factorial Trailing Zeroes
     * Given an integer n, return the number of trailing zeroes in n!.

     Note: Your solution should be in logarithmic time complexity.

     time : O(logn)
     space : O(n)

     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}

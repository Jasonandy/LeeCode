package cn.ucaner.leecode.cspiration;

public class _7_ReverseInteger {

    /**
     * Reverse digits of an integer.

     Example1: x = 123, return 321
     Example2: x = -123, return -321

     int : -2^31, 2^31-1
     -2147483648 ~ 2147483647

     corner case : 越界
     time : O(logn);
     space : O(1);
     * @param x
     * @return
     */

    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }
        return (int)res;
    }

    public static int reverse2(int x) {
        int res = 0;
        while (x != 0) {
            int cur = res;
            res = res * 10 + x % 10;
            if (res / 10 != cur) return 0;
            x = x / 10;
        }
        return res;
    }
}

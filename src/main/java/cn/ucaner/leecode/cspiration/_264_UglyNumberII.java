package cn.ucaner.leecode.cspiration;

public class _264_UglyNumberII {
    /**
     * 264. Ugly Number II
     * Write a program to find the n-th ugly number.

     Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
     * time : O(n)
     * space : O(n)
     *
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        int[] nums = new int[n];
        int index2 = 0, index3 = 0, index5 = 0;
        nums[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.min(nums[index2] * 2, Math.min(nums[index3] * 3, nums[index5] * 5));
            if (nums[i] == nums[index2] * 2) index2++;
            if (nums[i] == nums[index3] * 3) index3++;
            if (nums[i] == nums[index5] * 5) index5++;
        }
        return nums[n - 1];
    }
}

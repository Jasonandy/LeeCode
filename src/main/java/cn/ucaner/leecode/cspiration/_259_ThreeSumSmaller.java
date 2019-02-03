package cn.ucaner.leecode.cspiration;

import java.util.Arrays;

public class _259_ThreeSumSmaller {

    /**
     * 259. 3Sum Smaller
     * nums = [-2, 0, 1, 3], and target = 2.
     * time : O(n^2);
     * space : O(1);
     * @param nums
     * @param target
     * @return
     */
    public int threeSumSmaller(int[] nums, int target) {
        int res = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] < target) {
                    res += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
}

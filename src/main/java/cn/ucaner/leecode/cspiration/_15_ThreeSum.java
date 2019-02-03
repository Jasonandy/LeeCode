package cn.ucaner.leecode.cspiration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_ThreeSum {
    /**
     *
     For example, given array S = [-1, 0, 1, 2, -1, -4],
     A solution set is:
     [
     [-1, 0, 1],
     [-1, -1, 2]
     ]

     [-4, -1, -1, 0, 1, 2]

     time : O(n^2);
     space : O(n^2);
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1, high = nums.length - 1;
            int sum = 0 - nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == sum) {
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                } else if (nums[low] + nums[high] < sum) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return res;
    }
}

package cn.ucaner.leecode.cspiration;

import java.util.HashMap;

public class _219_ContainsDuplicateII {
    /**
     * 219. Contains Duplicate II
     * @param nums
     * @param k
     * @return
     */
    //time : O(n) space : O(n)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if ((i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

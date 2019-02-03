package cn.ucaner.leecode.cspiration;

import java.util.HashMap;

/**
* @Package：cn.ucaner.leecode.cspiration   
* @ClassName：_1_TwoSum  
* @Description：   <p> _1_TwoSum - </p>
* @Author： Jason    
* @CreatTime：2019年2月3日 - 下午10:39:12
* @Modify By：   
* @ModifyTime：  2019年2月3日
* @Modify marker：   
* @version    V1.0
 */
public class _1_TwoSum {

    /**
     * time : O(n)
     * space : O(n)
     * @param nums
     * @param target
     * @return
     */

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }

        int[] res = new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }

        return res;
    }
}

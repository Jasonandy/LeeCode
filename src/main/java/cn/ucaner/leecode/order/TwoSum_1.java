/******************************************************************************
* ~ Copyright (c) 2018 [jasonandy@hotmail.com | https://github.com/Jasonandy] *
* ~                                                                           *
* ~ Licensed under the Apache License, Version 2.0 (the "License”);           * 
* ~ you may not use this file except in compliance with the License.          *
* ~ You may obtain a copy of the License at                                   *
* ~                                                                           *
* ~    http://www.apache.org/licenses/LICENSE-2.0                             *
* ~                                                                           *
* ~ Unless required by applicable law or agreed to in writing, software       *
* ~ distributed under the License is distributed on an "AS IS" BASIS,         *
* ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
* ~ See the License for the specific language governing permissions and       *
* ~ limitations under the License.                                            *
******************************************************************************/
package cn.ucaner.leecode.order;

import java.util.HashMap;
import java.util.Map;

/**     
* @Package：cn.ucaner.leecode.order   
* @ClassName：TwoSum_1   
* @Description：   <p> TwoSum_1 @url https://leetcode-cn.com/problems/two-sum/</p>
* @Author： - Jason    
* @CreatTime：2019年1月24日 上午11:09:42   
* @Modify By：   
* @ModifyTime：  2019年1月24日
* @Modify marker：   
* @version    V1.0
*/
/***********************************
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
************************************/
public class TwoSum_1 {
	
	/**
	 * @Description: 官方解答 暴力破解
	 * @param nums   数据nums
	 * @param target 目标值
	 * @return int[] 返回数组下表
	 * @Autor: @Jason - jasonandy@hotmail.com
	 */
	private static int[] twoSumWayOne(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	/** 为了对运行时间复杂度进行优化，我们需要一种更有效的方法来检查数组中是否存在目标元素。
	如果存在，我们需要找出它的索引。保持数组中的每个元素与其索引相互对应的最好方法是什么？哈希表。
	通过以空间换取速度的方式，我们可以将查找时间从 O(n)O(n) 降低到 O(1)O(1)。
	哈希表正是为此目的而构建的，它支持以 近似 恒定的时间进行快速查找。我用“近似”来描述，是因为一旦出现冲突，查找用时可能会退化到 O(n)O(n)。
	但只要你仔细地挑选哈希函数，在哈希表中进行查找的用时应当被摊销为 O(1)O(1)。
	一个简单的实现使用了两次迭代。在第一次迭代中，我们将每个元素的值和它的索引添加到表中。
	然后，在第二次迭代中，我们将检查每个元素所对应的目标元素（target - nums[i]target−nums[i]）是否存在于表中。
	注意，该目标元素不能是 nums[i]nums[i] 本身！*/
	private static int[] twoSumWayTwo(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {//将值放入HashMap [key:V,value:K]
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];//需要找到的值
	        //是否包含目标值  而且这个目标值不是自己本身 ？为什么不能是自己本身呢？
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	/*事实证明，我们可以一次完成。
	在进行迭代并将元素插入到表中的同时，我们还会回过头来检查表中是否已经存在当前元素所对应的目标元素。
	如果它存在，那我们已经找到了对应解，并立即将其返回。*/
	private static  int[] twoSumWayThree(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        //数据放入的同时进行数据的检测.
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	/**
	 * @Description: JUST FOR TEST
	 * @Autor: @Jason - jasonandy@hotmail.com
	 */
	public static void main(String[] args) {
		int[] nums = {19,94,11,15,06,21,97,95};
		int[] twoSum = twoSumWayOne(nums, 26);
		int[] twoSumWayTwo = twoSumWayTwo(nums, 26);
		int[] twoSumWayThree = twoSumWayThree(nums, 26);
		for (int num : twoSum) {
			System.out.printf("[INDEX1 is %s .]", num);
		}
		for (int num : twoSumWayTwo) {
			System.out.printf("[INDEX2 is %s .]", num);
		}
		for (int num : twoSumWayThree) {
			System.out.printf("[INDEX3 is %s .]", num);
		}
	}
	

}

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

/**     
* @Package：cn.ucaner.leecode.order   
* @ClassName：MedianOfTwoSortedArrays_4   
* @Description：   <p> MedianOfTwoSortedArrays_4 {@link https://leetcode-cn.com/problems/median-of-two-sorted-arrays/}</p>
* @Author： - Jason    
* @CreatTime：2019年1月24日 下午3:17:37   
* @Modify By：   
* @ModifyTime：  2019年1月24日
* @Modify marker：   
* @version    V1.0
*/
/******************************************************
给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
你可以假设 nums1 和 nums2 不会同时为空。
	示例 1:
		nums1 = [1, 3]
		nums2 = [2]
				则中位数是 2.0
	示例 2:
		nums1 = [1, 2]
		nums2 = [3, 4]
			则中位数是 (2 + 3)/2 = 2.5
***********************************************************/
public class _4_MedianOfTwoSortedArrays {
	
	
	 private static double findMedianSortedArrays(int[] A, int[] B) {
	        int m = A.length;
	        int n = B.length;
	        if (m > n) { // to ensure m<=n
	        int[] temp = A; A = B; B = temp;
	        int tmp = m; m = n; n = tmp;
	    }
	    int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
	    while (iMin <= iMax) {
	        int i = (iMin + iMax) / 2;
	        int j = halfLen - i;
	        if (i < iMax && B[j-1] > A[i]){
	            iMin = i + 1; // i is too small
	        }
	        else if (i > iMin && A[i-1] > B[j]) {
	            iMax = i - 1; // i is too big
	        }
	        else { // i is perfect
	            int maxLeft = 0;
	            if (i == 0) { maxLeft = B[j-1]; }
	            else if (j == 0) { maxLeft = A[i-1]; }
	            else { maxLeft = Math.max(A[i-1], B[j-1]); }
	            if ( (m + n) % 2 == 1 ) { return maxLeft; }
	
	            int minRight = 0;
	            if (i == m) { minRight = B[j]; }
	            else if (j == n) { minRight = A[i]; }
	            else { minRight = Math.min(B[j], A[i]); }
	
	            return (maxLeft + minRight) / 2.0;
	        }
	    }
	    return 0.0;
	}
	 
	 /**
	  * @Description: JUST FOR TEST
	  * @Autor: @Jason - jasonandy@hotmail.com
	  */
	 public static void main(String[] args) {
		 int[] A = {19,94,1115};
		 int[] B = {18,20,22};
		 System.out.println(findMedianSortedArrays(A, B));
	}

}

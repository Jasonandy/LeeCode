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
* @ClassName：LongestPalindromicSubstring   
* @Description：   <p> LongestPalindromicSubstring_5 {@link https://leetcode-cn.com/problems/longest-palindromic-substring/}</p>
* @Author： - Jason    
* @CreatTime：2019年1月24日 下午3:28:06   
* @Modify By：   
* @ModifyTime：  2019年1月24日
* @Modify marker：   
* @version    V1.0
*/
/************************************************************************
 	给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
	示例 1：
		输入: "babad"
		输出: "bab"
		注意: "aba" 也是一个有效答案。
	示例 2：
		输入: "cbbd"
		输出: "bb"
************************************************************************/
public class _5_LongestPalindromicSubstring {
	
	private static  String longestPalindrome(String s) {
	    if (s == null || s.length() < 1) return "";
	    int start = 0, end = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int len1 = expandAroundCenter(s, i, i);
	        int len2 = expandAroundCenter(s, i, i + 1);
	        int len = Math.max(len1, len2);
	        if (len > end - start) {
	            start = i - (len - 1) / 2;
	            end = i + len / 2;
	        }
	    }
	    return s.substring(start, end + 1);
	}

	private static int expandAroundCenter(String s, int left, int right) {
	    int L = left, R = right;
	    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	        L--;
	        R++;
	    }
	    return R - L - 1;
	}
	
	
	
	
	/**
	 * @Description: JUST FOR TEST 
	 * @Autor: @Jason - jasonandy@hotmail.com
	 */
	public static void main(String[] args) {
		String str = "jasonandy@hotmail.com";
		System.out.println(longestPalindrome(str));
	}

}

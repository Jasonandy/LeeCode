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

import java.util.HashSet;
import java.util.Set;

/**     
* @Package：cn.ucaner.leecode.order   
* @ClassName：LongestSubstringWithoutRepeatingCharacters_3   
* @Description：   <p> LongestSubstringWithoutRepeatingCharacters {@link https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/}</p>
* @Author： - Jason    
* @CreatTime：2019年1月24日 下午2:56:23   
* @Modify By：   
* @ModifyTime：  2019年1月24日
* @Modify marker：   
* @version    V1.0
*/
/**
 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
	示例 1:
		输入: "abcabcbb"
		输出: 3 
		解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
	示例 2:
		输入: "bbbbb"
		输出: 1
		解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
	示例 3:
		输入: "pwwkew"
		输出: 3
	解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
	     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。*/
public class LongestSubstringWithoutRepeatingCharacters_3 {
	
	
	/**
	 方法一：暴力法
	 思路
	 逐个检查所有的子字符串，看它是否不含有重复的字符。
	 算法
		假设我们有一个函数 boolean allUnique(String substring) ，如果子字符串中的字符都是唯一的，它会返回true，否则会返回false。 
		我们可以遍历给定字符串 s 的所有可能的子字符串并调用函数 allUnique。
		如果事实证明返回值为true，那么我们将会更新无重复字符子串的最大长度的答案。
		现在让我们填补缺少的部分：
		为了枚举给定字符串的所有子字符串，我们需要枚举它们开始和结束的索引。
		假设开始和结束的索引分别为 ii 和 jj。那么我们有 0 <= i <j ≤n （这里的结束索引 jj 是按惯例排除的）。
		因此，使用 ii 从0到 n - 1n−1 以及 jj 从 i+1i+1 到 nn 这两个嵌套的循环，我们可以枚举出 s 的所有子字符串。
		要检查一个字符串是否有重复字符，我们可以使用集合。我们遍历字符串中的所有字符，并将它们逐个放入 set 中。
		在放置一个字符之前，我们检查该集合是否已经包含它。如果包含，我们会返回 false。循环结束后，我们返回 true。*/
	/**
	 * @Description: lengthOfLongestSubstring 
	 * @param s
	 * @return int
	 * @Autor: @Jason - jasonandy@hotmail.com
	 */
	private static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

	/**
	 * @Description: allUnique
	 * @param s
	 * @param start
	 * @param end
	 * @return boolean
	 * @Autor: @Jason - jasonandy@hotmail.com
	 */
    private static  boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
    
    /**
     * @Description: JUST FOR TEST
     * @Autor: @Jason - jasonandy@hotmail.com
     */
    public static void main(String[] args) {
    	//String str  = "jasoninternational.,ltd.jasonandy@hotamil.com"; 
    	String str  = "abcabcaabbccbacbcbcbcbcababa";
    	System.out.println(lengthOfLongestSubstring(str));
	}
	

}

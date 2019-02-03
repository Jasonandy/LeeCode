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
package cn.ucaner.leecode.cspiration;

import java.util.ArrayList;
import java.util.List;

/**
* @Package：cn.ucaner.leecode.cspiration   
* @ClassName：_131_PalindromePartitioning  
* @Description：   <p> _131_PalindromePartitioning - </p>
* @Author： Jason    
* @CreatTime：2019年2月3日 - 下午10:46:29
* @Modify By：   
* @ModifyTime：  2019年2月3日
* @Modify marker：   
* @version    V1.0
 */
public class _131_PalindromePartitioning {
    /**
     * 131. Palindrome Partitioning
     * Given a string s, partition s such that every substring of the partition is a palindrome.

     Return all possible palindrome partitioning of s.

     For example, given s = "aab",
     Return

     [
     ["aa","b"],
     ["a","a","b"]
     ]

     time: O(2^n) space O(n)

     * @param s
     * @return
     */

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s == null || s.length() == 0) return res;
        helper(res, new ArrayList<>(), s);
        return res;
    }
    public void helper(List<List<String>> res, List<String> list, String s) {
        if (s.length() == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s.substring(0, i + 1))) {
                list.add(s.substring(0, i + 1));
                helper(res, list, s.substring(i + 1));
                list.remove(list.size() - 1);
            }
        }
    }
    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

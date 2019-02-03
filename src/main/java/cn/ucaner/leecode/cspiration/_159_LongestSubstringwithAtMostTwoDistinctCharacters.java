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

import java.util.HashMap;

public class _159_LongestSubstringwithAtMostTwoDistinctCharacters {
    /**
     * 159. Longest Substring with At Most Two Distinct Characters
     * Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

     For example, Given s = “eceba”,

     T is "ece" which its length is 3.

     sliding window

     “eceba”

     time : O(n)
     space : O(n)

     * @param s
     * @return
     */

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0;
        int res = 0;
        while (end < s.length()) {
            if (map.size() <= 2) {
                map.put(s.charAt(end), end);
                end++;
            }
            if (map.size() > 2) {
                int leftMost = s.length();
                for (int num : map.values()) {
                    leftMost = Math.min(leftMost, num);
                }
                map.remove(s.charAt(leftMost));
                start = leftMost + 1;
            }
            res = Math.max(res, end - start);
        }
        return res;
    }
}

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

public class _233_NumberofDigitOne {
    /**
     * 233. Number of Digit One
     * Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.

     For example:
     Given n = 13,
     Return 6, because digit 1 occurred in the following numbers: 1, 10, 11, 12, 13.

     10 : 1    个位
     100 : 10  十位
     1000: 100 百位

     例子:
     以算百位上1为例子:   假设百位上是0, 1, 和 >=2 三种情况:
     case 1: n=3141092, a= 31410, b=92. 计算百位上1的个数应该为 3141 *100 次.
     case 2: n=3141192, a= 31411, b=92. 计算百位上1的个数应该为 3141 *100 + (92+1) 次.
     case 3: n=3141592, a= 31415, b=92. 计算百位上1的个数应该为 (3141+1) *100 次.

     http://blog.csdn.net/xudli/article/details/46798619

     time : O(logn)
     space : O(1)

     * @param n
     * @return
     */

    public int countDigitOne(int n) {
        int res = 0;
        for (long m = 1; m <= n; m *= 10) {
            long a = n / m;
            long b = n % m;
            res += (a + 8) / 10 * m;
            if (a % 10 == 1) res += b + 1;
        }
        return res;
    }
}

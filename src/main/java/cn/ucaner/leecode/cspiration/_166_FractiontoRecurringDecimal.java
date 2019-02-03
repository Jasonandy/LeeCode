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

public class _166_FractiontoRecurringDecimal {

    /**
     * 166. Fraction to Recurring Decimal
     * Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

     If the fractional part is repeating, enclose the repeating part in parentheses.

     For example,

     Given numerator = 1, denominator = 2, return "0.5".
     Given numerator = 2, denominator = 1, return "2".
     Given numerator = 2, denominator = 3, return "0.(6)".

     0.2(34)

     1, 0 + - 越界
     2, 整数
     3, 小数 -> 循环

     time : O(logn)
     space : O(n)

     * @param numerator
     * @param denominator
     * @return
     */
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        res.append(((numerator > 0) ^ (denominator > 0) ? "-" : ""));
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);

        res.append(num / den);
        num %= den;
        if (num == 0) {
            return res.toString();
        }

        res.append(".");
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(num, res.length());

        while (num != 0) {
            num *= 10;
            res.append(num / den);
            num %= den;
            if (map.containsKey(num)) {
                int index = map.get(num);
                res.insert(index, "(");
                res.append(")");
                break;
            } else {
                map.put(num, res.length());
            }
        }
        return res.toString();
    }
}

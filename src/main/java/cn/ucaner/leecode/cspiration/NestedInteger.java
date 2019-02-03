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

public class NestedInteger {

    Integer value;
    List<NestedInteger> list;

    NestedInteger() {
        value = new Integer(0);
        list = new ArrayList<>();
    }
    NestedInteger(int value) {
        this.value = value;
    }
    NestedInteger(int value, List<NestedInteger> list) {
        this.value = value;
        this.list = list;
    }
    public void add(NestedInteger nestedInteger){}

    // @return true if this NestedInteger holds a single integer,
    // rather than a nested list.
    public boolean isInteger() {
        return value != null;
    }
    // @return the single integer that this NestedInteger holds,
    // if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger() {
        return value;
    }
    // @return the nested list that this NestedInteger holds,
    // if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList() {
        return list;
    }

    public Integer next() {
        return value; // 例子，真正函数不是这么写的
    }
    public boolean hasNext() {
        return true; // 例子，真正函数不是这么写的
    }


}

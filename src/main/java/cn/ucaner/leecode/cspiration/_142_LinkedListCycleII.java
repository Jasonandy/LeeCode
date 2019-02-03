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

/**
* @Package：cn.ucaner.leecode.cspiration   
* @ClassName：_142_LinkedListCycleII  
* @Description：   <p> _142_LinkedListCycleII - </p>
* @Author： Jason    
* @CreatTime：2019年2月3日 - 下午10:46:17
* @Modify By：   
* @ModifyTime：  2019年2月3日
* @Modify marker：   
* @version    V1.0
 */
public class _142_LinkedListCycleII {

    /**
     * 142. Linked List Cycle II
     * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
     *
     * time : O(n)
     * space : O(1)
     *
     * @param head
     * @return
     */

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                ListNode slow2 = head;
                while (slow != slow2) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }
}

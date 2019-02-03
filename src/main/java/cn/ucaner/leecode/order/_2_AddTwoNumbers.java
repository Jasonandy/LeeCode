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
* @ClassName：AddTwoNumbers   
* @Description：   <p> AddTwoNumbers_2 {@link  https://leetcode-cn.com/problems/add-two-numbers/ } </p>
* @Author： - Jason    
* @CreatTime：2019年1月24日 上午11:36:40   
* @Modify By：   
* @ModifyTime：  2019年1月24日
* @Modify marker：   
* @version    V1.0
*/
/**
 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807*/
public class _2_AddTwoNumbers {
	
	public static ListNode addTwoNumbers(ListNode ln1, ListNode ln2) {
	    ListNode dummyHead = new ListNode(0); //头节点
	    
	    ListNode p = ln1, q = ln2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}
	
	
	static class ListNode{
		//值
		int val;
		//下一个节点
		ListNode next;
		/**
		* ListNode. 
		* @param index 默认构造
		 */
		ListNode(int index){val = index;}

		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}
		
	}
	
	/**
	 * @Description: JUST FOR TEST 
	 * @Autor: @Jason - jasonandy@hotmail.com
	 */
	public static void main(String[] args) {
		
		// 8 --> 9 --> 9
		ListNode list11 = new ListNode(8);
		ListNode list12 = new ListNode(9);
		ListNode list13 = new ListNode(9);
		
		//2 --> 9 
		ListNode list21 = new ListNode(2);
		ListNode list22 = new ListNode(9);
		
		list11.next = list12;
		list12.next = list13;
		list13.next = null;
		list21.next = list22;
		
		ListNode addTwoNumbers = addTwoNumbers(list11, list21);
		System.out.println(addTwoNumbers); // 0 - 9 - 0 - 1
		
	}
	

}

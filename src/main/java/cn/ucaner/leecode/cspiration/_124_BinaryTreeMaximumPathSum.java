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
* @ClassName：_124_BinaryTreeMaximumPathSum  
* @Description：   <p> _124_BinaryTreeMaximumPathSum - </p>
* @Author： Jason    
* @CreatTime：2019年2月3日 - 下午10:47:00
* @Modify By：   
* @ModifyTime：  2019年2月3日
* @Modify marker：   
* @version    V1.0
 */
public class _124_BinaryTreeMaximumPathSum {
    /**
     * 124. Binary Tree Maximum Path Sum
     * Given a binary tree, find the maximum path sum.

     For this problem, a path is defined as any sequence of nodes from some starting node to any node
     in the tree along the parent-child connections. The path must contain at least one node and does not
     need to go through the root.

     For example:
     Given the below binary tree,

       1
      / \
     2   3
     Return 6.

          3
         / \
        9  20
      /  \
     15   7


     time : O(n)
     space : O(n)

     */

    int res;

    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        res = Integer.MIN_VALUE;
        helper(root);
        return res;
    }

    public int helper(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        res = Math.max(res, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}

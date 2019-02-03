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
import java.util.Stack;

/**
* @Package：cn.ucaner.leecode.cspiration   
* @ClassName：_144_BinaryTreePreorderTraversal  
* @Description：   <p> _144_BinaryTreePreorderTraversal - </p>
* @Author： Jason    
* @CreatTime：2019年2月3日 - 下午10:46:03
* @Modify By：   
* @ModifyTime：  2019年2月3日
* @Modify marker：   
* @version    V1.0
 */
public class _144_BinaryTreePreorderTraversal {

    /**
     * 144. Binary Tree Preorder Traversal
     * Given a binary tree, return the preorder traversal of its nodes' values.

     For example:
     Given binary tree {1,#,2,3},
     1
      \
      2
      /
     3
     return [1,2,3].
     queue : 3, 2, 1
     stack : 1, 2, 3
     time : O(n);
     space : O(n);
     * @param root
     * @return
     */

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        helper(res, root);
        return res;
    }

    public static void helper(List<Integer> res, TreeNode root) {
        if (root == null) return;
        res.add(root.val);
        helper(res, root.left);
        helper(res, root.right);
    }

    public static List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur.right != null) stack.push(cur.right);
            if (cur.left != null) stack.push(cur.left);
            res.add(cur.val);
        }
        return res;
    }
}

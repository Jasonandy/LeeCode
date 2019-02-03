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

public class _250_CountUnivalueSubtrees {
    /**
     * 250. Count Univalue Subtrees
     * Given a binary tree, count the number of uni-value subtrees.

     A Uni-value subtree means all nodes of the subtree have the same value.

     For example:
     Given binary tree,
         5
        / \
       1   5
      / \   \
     5   5   5
     return 4.

     root = 5 res = 2
     root = 1
     root = 5 res = 3
     root = 5 res = 4

     time : O(n)
     space : O(n)


     */

    int res;

    public int countUnivalSubtrees(TreeNode root) {
        res = 0;
        helper(root);
        return res;
    }

    public boolean helper(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean left = helper(root.left);
        boolean right = helper(root.right);

        if (left && right) {
            if (root.left != null && root.val != root.left.val) {
                return false;
            }
            if (root.right != null && root.val != root.right.val) {
                return false;
            }
            res++;
            return true;
        }
        return false;
    }

}

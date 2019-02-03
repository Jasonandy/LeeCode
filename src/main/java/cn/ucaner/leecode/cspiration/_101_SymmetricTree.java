package cn.ucaner.leecode.cspiration;

/**
* @Package：cn.ucaner.leecode.cspiration   
* @ClassName：_101_SymmetricTree  
* @Description：   <p> _101_SymmetricTree - </p>
* @Author： Jason    
* @CreatTime：2019年2月3日 - 下午10:39:50
* @Modify By：   
* @ModifyTime：  2019年2月3日
* @Modify marker：   
* @version    V1.0
 */
public class _101_SymmetricTree {
    /**
     * 101. Symmetric Tree
     *Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

     For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
         1
        / \
       2   2
      / \ / \
     3  4 4  3
     time : O(n)
     space : O(n)
     * @param root
     * @return
     */

    public static boolean isSymmetric(TreeNode root) {

        if (root == null) return true;
        return helper(root.left, root.right);
    }

    public static boolean helper(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return helper(p.left, q.right) && helper(p.right, q.left);
    }
}

package cn.ucaner.leecode.cspiration;

/**
* @Package：cn.ucaner.leecode.cspiration   
* @ClassName：_100_SameTree  
* @Description：   <p> _100_SameTree - </p>
* @Author： Jason    
* @CreatTime：2019年2月3日 - 下午10:39:44
* @Modify By：   
* @ModifyTime：  2019年2月3日
* @Modify marker：   
* @version    V1.0
 */
public class _100_SameTree {

    /**
     * 100. Same Tree

     Given two binary trees, write a function to check if they are equal or not.

     Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

     time : O(n);
     space : O(n);
     * @param p
     * @param q
     * @return
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

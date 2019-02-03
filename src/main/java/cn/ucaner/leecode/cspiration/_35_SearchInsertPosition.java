package cn.ucaner.leecode.cspiration;

public class _35_SearchInsertPosition {

    /**
     *
     Here are few examples.
     [1,3,5,6] 5   2
     output : 2   1


     time : O(logn);
     space : O(1);
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}

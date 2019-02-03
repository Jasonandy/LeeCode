package cn.ucaner.leecode.cspiration;

public class _278_FirstBadVersion {
    /**
     * 278. First Bad Version
                 bad
     1, 2, 3, 4, 5, 6, 7

     time : O(logn)
     space : O(1)
     * @param n
     * @return
     */

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = (end - start) / 2 + start;
            if (isBadVersion(mid)) {
                end = mid;
            } else start = mid + 1;
        }

        return start;
    }

    public int firstBadVersion2(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (isBadVersion(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public int firstBadVersion3(int n) {
        int start = 1;
        int end = n;

        while (start + 1< end) {
            int mid = (end - start) / 2 + start;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (isBadVersion(start)) {
            return start;
        }
        return end;
    }

    public boolean isBadVersion(int mid) {
        return true;
    }
}

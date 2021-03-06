package cn.ucaner.leecode.cspiration;

import java.util.ArrayList;
import java.util.List;

public class _118_PascalTriangle {
    /**
     * 118. Pascal's _120_Triangle
     * For example, given numRows = 5,
     Return

     [
         [1],
        [1,1],
       [1,2,1],
      [1,3,3,1],
     [1,4,6,4,1]
     ]


     time : O(n^2)
     space : O(n)

     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(0, 1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
            res.add(new ArrayList<>(list));
        }
        return res;
    }
}

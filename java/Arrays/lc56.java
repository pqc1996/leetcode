package Arrays;
import java.util.Arrays;

public class lc56 {
        public int[][] merge(int[][] intervals) {
            //按开始区间排序
            Arrays.sort(intervals,(v1,v2)->v1[0]-v2[0]);
            //复制数组
            int[][] res = new int[intervals.length][2];
            //操作res中的索引位置
            int index = -1;
            for(int[] interval :intervals){
                // 如果结果数组是空的，或者当前区间的起始位置 > 结果数组中最后区间的终止位置，
                // 则不合并，直接将当前区间加入结果数组。
                if(index == -1||interval[0]>res[index][1])
                    res[++index]=interval;
                else {
                    // 反之将当前区间合并至结果数组的最后区间
                    res[index][1]=Math.max(res[index][1],interval[1]);
                }
            }
            return Arrays.copyOf(res,index+1);
        }
    }


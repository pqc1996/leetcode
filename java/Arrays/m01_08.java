package Arrays;
//编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
//
//
//
// 示例 1：
//
// 输入：
//[
//  [1,1,1],
//  [1,0,1],
//  [1,1,1]
//]
//输出：
//[
//  [1,0,1],
//  [0,0,0],
//  [1,0,1]
//]
//
//
// 示例 2：
//
// 输入：
//[
//  [0,1,2,0],
//  [3,4,5,2],
//  [1,3,1,5]
//]
//输出：
//[
//  [0,0,0,0],
//  [0,4,5,0],
//  [0,3,1,0]
//]
//
// Related Topics 数组
// 👍 14 👎 0
import java.util.ArrayList;
import java.util.List;

public class m01_08 {
    public void setZeroes(int[][] matrix) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i =0 ;i< matrix.length;i++){
            for(int j =0 ;j< matrix[0].length;j++){
                if(matrix[i][j] ==0){
                    list1.add(i);
                    list2.add(j);
                }
            }
        }

        for(int i = 0;i<list1.size();i++){
            for(int k=0;k<matrix[0].length;k++){
                int tmp=list1.get(i);
               matrix[tmp][k] = 0;
            }
        }
        for(int j = 0;j<list2.size();j++){
            for(int k=0;k< matrix.length;k++)
                matrix[k][list2.get(j)]=0;
        }

    }

}

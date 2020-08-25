package Arrays;

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

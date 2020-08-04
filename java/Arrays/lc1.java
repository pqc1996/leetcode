package Arrays;

import java.util.HashMap;

class lc1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        if(nums==null||nums.length<1)
            return res;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=target-a;
            if(map.containsKey(b)){
                res[0]=map.get(b);
                res[1]=i;
                return res;
            }else{map.put(a,i);}
        }
        return res;
    }
}
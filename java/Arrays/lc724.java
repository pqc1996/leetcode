package Arrays;


public class lc724 {
    public int pivotIndex(int[] nums) {
        int leftsum = 0,sum=0;
        for(int x : nums)sum +=x;
        for(int i =0;i<nums.length;i++){
            if(leftsum == sum-leftsum-nums[i]) return i;
            else leftsum +=nums[i];
        }
        return -1;
    }
}

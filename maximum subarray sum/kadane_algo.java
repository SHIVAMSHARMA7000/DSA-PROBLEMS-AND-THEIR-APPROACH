public class kadane_algo{
     public static int maxSubArray(int[] nums) {
       int current_sum = 0;
       int max_sum = nums[0];
       for(int i = 0;i<nums.length;i++){
       current_sum = Math.max(nums[i],current_sum+nums[i]);
        max_sum = Math.max(current_sum,max_sum);
       }
     return max_sum;   
    }
    public static void main(String[] args){
        int a[] = {-1,-3,2,4,5,-6,8};
        maxSubArray(a);

    }
}
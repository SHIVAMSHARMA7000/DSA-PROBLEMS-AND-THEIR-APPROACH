import java.util.Arrays;

public  class by_sorting {
    public static  int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int freq = 1;
        int ans = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }
            else{
                freq = 1;
                ans = nums[i];

            }
            if(freq>(nums.length/2)){
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] ={2,3,3,2,3,3,3};
        System.out.print(majorityElement(a));
        
    }
    
}

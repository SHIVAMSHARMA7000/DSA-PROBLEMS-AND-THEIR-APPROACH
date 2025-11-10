public class single_ {
     public static int singleNumber(int[] nums) {
      int ans = 0;
      for(int i = 0;i<nums.length;i++){
        ans = ans^nums[i];
      }  
      

    return ans;        
    }
    public static void main(String[] args) {
        int a[] = {1,2,2,3,3,4,4};
        System.out.println(singleNumber(a));

    }
}   
public class boyer_moore {
    public static int majorityElement(int[] nums) {
      int freq = 0;
      int ans = 0;
      for(int i = 1;i<nums.length;i++){
        if(freq==0){
            ans = nums[i];
            
        }
        if(ans == nums[i]){
            freq++;
        }
        else{
            freq--;
        }
      }
      return ans;
    }
    public static void main(String[] args) {
        int a[] = {6,5,5};
        System.out.print(majorityElement(a));
    }
}

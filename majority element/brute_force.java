public class brute_force{
    public static  int majorityElement(int[] nums) {
        int count;
        for(int i = 0;i<nums.length;i++){
            count = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>(nums.length/2)){
                return nums[i];
            }
        }
        return -1;
    }
     public  static int majorityElement2(int[] nums) {
    int j = 0;
    int count = 0;
    for(int i = 0;i<nums.length;i++){
        if(nums[j]==nums[i]){
            count++;
        }
        if(i==nums.length-1){
            if(count>(nums.length/2)){
                return nums[j];
            }
            else{
                j++;
                count = 0;
                i = 0;
            }
        }
    }
    return -1;
    }

    public static void main(String[] args) {
        int a[] = {2,3,4,5,2,3,4,5,2,2,2,2,2,2,2,2};
        System.out.print(majorityElement(a));

        
    }   
}
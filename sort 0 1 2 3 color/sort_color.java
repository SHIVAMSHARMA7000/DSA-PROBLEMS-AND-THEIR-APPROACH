public class sort_color{
     public static void sortColors(int[] nums) {
        int k = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            k = Math.max(nums[i],k);

        }
        int count[] = new int[k+1];
        for(int i = 0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j = 0;
        for(int i = 0;i<count.length;i++){
            while(count[i]>0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        } 
        
        
    }
    public static void main(String[] args){
        int a[] = [0,2,2,1,1,2,1];
        sortColors(a);
    }

}
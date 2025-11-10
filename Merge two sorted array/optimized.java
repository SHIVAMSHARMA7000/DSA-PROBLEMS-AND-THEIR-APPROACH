public class optimized{
       public  static void merge(int[] nums1, int m, int[] nums2, int n) {
     int i = m-1;
     int j = n-1;
     int idx = m+n-1;
     while(i>=0&&j>=0){
        if(nums1[i]>=nums2[j]){
            nums1[idx] = nums1[i];
            i--;
            idx--;

        }
        else{
            nums1[idx] = nums2[j];
            j--;
            idx--;
        }
     }
     while(j>=0){
        nums1[idx] = nums2[j];
        idx--;
        j--;
     }
    }
    public static void main(String[] args) {
        int a[] = {2,3,4,5,6,7,0,0,0,0};
        int b[] = {1,4,5,6};
        merge(a,6,b,4);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
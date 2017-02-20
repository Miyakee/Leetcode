package easy;

/**
 * Created by chentingyu on 2017/2/20.
 */
public class LeeSearchInsert {

     static int searchInsert(int[] nums, int target) {
         int i;
         for(i=0;i<nums.length;i++){
             if(nums[i]>=target){
                 break;
             }

         }
         return i;
     }

    static int searchInsert2(int[] nums, int target) {
        int i=0,j=nums.length-1;
        if(target>nums[j]){
            return j+1;
        }
        while (i<=j){
            if(nums[i]>=target){
                return i;
            }
            if(nums[j]<target){
                return j+1;
            }
            if(nums[j]==target){
                return j;
            }            i++;
            j--;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] h= {3,4,9,10};
        int p=searchInsert2(h,5);
        System.out.print(p);

    }
}

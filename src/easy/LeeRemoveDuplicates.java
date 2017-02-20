package easy;

/**
 * Created by chentingyu on 2017/2/20.
 * Given a sorted array,
 * remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 */
public class LeeRemoveDuplicates {


    private static int RemoveDuplicates(int[] nums) {
        int i=0;
        int j=1;

        while(j<nums.length) {
            if(nums[j]>nums[i]){
                i=i+1;
                nums[i]=nums[j];

            }
            j++;
        }

        return i+1;
    }
    public static void main(String[] args) {
        int[] h= {2,2,2,2};
        int p=RemoveDuplicates(h);
        System.out.print(p);

    }
}

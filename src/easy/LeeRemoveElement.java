package easy;

/**
 * Created by chentingyu on 2017/2/20.
 */
public class LeeRemoveElement {
    public static  int removeElement(int[] nums, int val) {
        int m=0;
        int j=0;
        int i;
        for( i=0;i<nums.length-m;i++){
            while (nums[j+i]==val){
                m++;
                j++;

                if((i+j)>=nums.length){
                    return i;
                }
            }
            nums[i]=nums[i+m];
        }

        return i;
    }

    public static void main(String[] args) {
        int[] h= {3,2,2,2,3};
        int p=removeElement(h,2);
        System.out.print(p);

    }
}

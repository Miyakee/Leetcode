package easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by chentingyu on 2017/2/8.
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 */
public class LeeTwoSum {

     static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
         int max=nums.length;
             res[0]=0;
             res[1]=1;
         int i=0,j=max-1;
         ArrayList Lists = new ArrayList();
         for(int m = 0; m<max; m++){
             Lists.add(nums[m]);
         }
         Arrays.sort(nums);
         a:for(;j>=i;j--) {
             while (i <= j) {
                 if (nums[i] + nums[j] < target) {
                     i++;
                 } else if (nums[i] + nums[j] > target) {
                     break ;
                 } else {
                     res[0]=Lists.indexOf(nums[i]);
                     Lists.set(res[0],nums[j]-1);
                     res[1]=Lists.indexOf(nums[j]);
                     break a;
                 }
             }
         }

         return res;

    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};int target = 6;
        int[] ss=twoSum(nums,target);
        System.out.print(ss[0]+"dsdsf"+ss[1]);
    }

}

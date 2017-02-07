package medium;

/**
 * Created by chentingyu on 2017/2/7.
 *
 *  Given n non-negative integers a1, a2, ..., an,where each represents a point
 *  at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 *  Find two lines, which together with x-axis forms a container,
 *  such that the container contains the most water.
 *  Note: You may not slant the container and n is at least 2.
 *
 */
public class LeeContainerWithMostWater {

    public static int maxArea(int[] height) {
        int max = 0;
        int i=0,j=height.length-1;
        while (j>i){
            int num;
            if(height[i]>height[j]){
                num = height[j]*(j-i);
                j--;
            }else {
                num = height[i]*(j-i);
                i++;
            }
            if(num>max){
                max=num;
            }

        }


        return max;

    }

    public static void main(String[] args) {
        int[] a={2,1,9};
        int p=maxArea(a);
        System.out.print(p);

    }

}

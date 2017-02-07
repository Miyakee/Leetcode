package medium;

/**
 * Created by chentingyu on 2017/2/7.
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

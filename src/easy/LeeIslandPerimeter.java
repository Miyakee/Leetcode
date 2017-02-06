package easy;

/**
 * Created by chentingyu on 2017/2/6.
 */
public class LeeIslandPerimeter {
    public static  int LeeIslandPerimeter(int[][] grid) {

        int m=0,all=0;
        int [][] num = new int [grid.length+2][grid[0].length+2];
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if (grid[i][j]==1){
                    num[i+1][j+1]=1;

                }
            }
        }


        for(int q=1;q<grid.length+1;q++){
            for(int p=1;p<grid[0].length+1;p++) {
                if (num[q][p] == 1) {
                    all++;
                    if (num[q - 1][p] == 1) {
                        m++;
                    }
                    if (num[q + 1][p] == 1) {
                        m++;
                    }
                    if (num[q][p - 1] == 1) {
                        m++;
                    }
                    if (num[q][p + 1] == 1) {
                        m++;
                    }
                }
            }
        }

        return all*4-m;
    }

    public static void main(String[] args) {
            int[][] gg={{1,1,0,0},
             {1,1,1,0},
             {0,1,0,0},
             {1,1,0,0}};
        int ad=LeeIslandPerimeter(gg);
        System.out.print(ad);

    }
}

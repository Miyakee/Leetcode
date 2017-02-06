package easy;

/**
 * Created by chentingyu on 2017/2/5.
 *
 * leetcode 罗马数字转阿拉伯
 */
public class LeeromanToInt {
    public static int romanToInt(String s) {
        s=s.toLowerCase();
        int master = 0;

//        master=master+change(s.charAt(0));

        for (int i = 0; i < s.length()-1; i++) {
            char ch = s.charAt(i);
            char af = s.charAt(i +1);
            int chin = change(ch);
            int afin = change(af);
            if (chin<afin ){
                master=master-chin;
            }
            if(chin > afin || chin == afin){
                master=master+chin;

            }


        }

        return master+change(s.charAt(s.length()-1));

    }

    public static int change(char a) {
        int gu;
        switch (a) {
            case 'i':
                gu = 1;
                break;
            case 'v':
                gu = 5;
                break;
            case 'x':
                gu = 10;
                break;
            case 'l':
                gu = 50;
                break;
            case 'c':
                gu = 100;
                break;
            case 'd':
                gu = 500;
                break;
            case 'm':
                gu = 1000;
                break;
            default:
                gu = 0;
        }
        return gu;
    }


    public static void main(String[] args) {
           String h="DCxxi";
int p=romanToInt(h);
        System.out.print(p);

    }
}


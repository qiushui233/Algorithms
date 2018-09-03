package AlgClass1.Alg1_4;

/**
 * 编写一个程序，有序打印给定的两个有序数组（含有N个int值）中的所有公共元素，程序在最坏的情况下所需的运行时间应该和N成正比。
 */

public class pra1_4_12 {

    public static void main(String[] args) {
        int[]  b = {1,2,4,5,6,9};
        int[]  a = {1,2,3,4,5,6,7,8,9};

        print(a,b);
    }

    public static void print(int[] a,int[] b){

        if (a.length > b.length){

            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] > b[i]) continue;
                    if (a[j] == b[i]) {
                        System.out.println(a[j]);
                        continue;
                    }
                }
            }


        }else{

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (b[j] > a[i]) continue;
                    if (b[j] == a[i]) {
                        System.out.println(a[i]);
                        continue;
                    }
                }
            }

        }


    }
}

package AlgClass1.Alg1_4;

import java.util.Arrays;

/**
 * 最接近的一对（一维）
 * 编写一个程序，给定一个含有N个double值的数组a[]，在其中找到一对最接近的值：两者之差（绝对值）最小的两个数。
 * 程序在最坏的情况下所需的运行时间应该是线性级别。
 */
public class pra1_4_16 {

    public static void abs(double[] a){
        Arrays.sort(a);

        double min = Double.MAX_VALUE;

        double one0 = a[0];
        double one1 = a[1];

        for (int i = 1; i < a.length; i++) {
            min = Math.min(min,a[i] - a[i - 1]);

        }
    }
}

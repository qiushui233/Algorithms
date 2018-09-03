package AlgClass1.Alg1_4;

import java.util.Arrays;

/**
 * 最遥远的一对（一维）
 * 编写一个程序，给定一个含有N个double值的数组a[]，在其中找到一对最遥远的值：两者之差（绝对值）最大的两个数。
 * 程序在最坏的情况下所需的运行时间应该是线性级别。
 */
public class pra1_4_17 {

    public static void main(String[] args) {
        double[] a = {1.1,2.2,3.3,4.4,5.5,7.7,6.6,9.9,8.8};

        biggest(a);
    }

    public static void biggest(double[] nums){
        Arrays.sort(nums);

        System.out.println(nums[0]+" "+nums[nums.length-1]);
    }

}

package AlgClass1.Alg1_4;

import java.util.Arrays;

/**
 * 编写一个程序，计算输入文件中相等的整数对的数量。如果你的第一个程序是平方级的，请继续思考并用Array.sort（）给出一个线性对数级的解答
 */
public class pra1_4_8 {

    public static void main(String[] args) {
        int[]  a = {1,1,2,2,4,4,5,5,6,3,3,9,9,7,6,7};

        System.out.println(count1(a));
        System.out.println(count2(a));

    }

    public static int count2(int[] nums){
        int count = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] - nums[i] == 0) count++;
        }

        return count;
    }

    public static int count1(int[] nums){

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])  count++;
            }
        }

        return count;
    }
}

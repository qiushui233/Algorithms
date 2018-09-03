package AlgClass1.Alg1_4;

/**
 * 快速3_sum
 * 使用一个线性级别的算法（而非基于二分查找的线性对数级别的算法）实现TwoSumFaster来计算已排序的数组中和为0的整数对的数量。
 * 用相同的思想为3—sum问题给出一个平方级别的算法。
 */
public class pra1_4_15 {

    public static void main(String[] args) {
        System.out.println();
    }

    public static int TwoSumFaster(int[] nums){
        int cnt = 0;
        int len = nums.length;
        for (int j = 0, k = len - 1; j < k;) {
            if (nums[j] + nums[k] < 0) {
                j++;
            } else if (nums[j] + nums[k] > 0) {
                k--;
            } else {
                j++;
                k--;
                ++cnt;
            }
        }
        return cnt;

    }

    public static int ThreeSumFaster(int[] nums){
        int cnt = 0;
        int len = nums.length;
        for (int j = 0; j < len - 2 ; j ++) {
            for(int k = j + 1,h = len -1;k < h;){
                if (nums[j] + nums[k] + nums[h] < 0) {
                    k++;
                } else if (nums[j] + nums[k] + nums[h] > 0) {
                    h--;
                } else {
                    k++;
                    h--;
                    ++cnt;
                }
            }
        }
        return cnt;
    }


}

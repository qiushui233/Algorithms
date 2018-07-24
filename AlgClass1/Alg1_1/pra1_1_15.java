package AlgClass1.Alg1_1;

public class pra1_1_15 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,2,3,5,6,4};
        int m = 10;
        for (int i:histogram(a,m)
             ) {
            System.out.print(i+" ");
        }



    }

    public static int[] histogram(int[] a,int m){
        int[] b = new int[m];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]){
                    b[i]++;
                }
            }
        }

        return b;
    }
}

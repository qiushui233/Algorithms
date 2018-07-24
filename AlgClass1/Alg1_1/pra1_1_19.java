package AlgClass1.Alg1_1;

public class pra1_1_19 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "  " + F(i));
        }
    }

    public static long F(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return F(n-1) + F(n - 2);
    }
}

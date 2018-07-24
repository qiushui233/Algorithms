package AlgClass1.Alg1_1;


public class pra1_1_27 {
    static int n = 0;
    public static void main(String[] args) {
        binomal(100,50,0.25);
        System.out.println(n);
    }

    public static double binomal(int N,int k,double p){
        n++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomal(N - 1,k ,p) + p * binomal(N - 1, k - 1, p);
    }
}

package AlgClass1.Alg1_1;

public class pra1_1_16 {
    public static void main(String[] args) {
        System.out.println(exR1(6));




    }

    public static String exR1(int m){
        if (m <= 0) return "";
        return exR1(m - 3) + m + exR1(m-2) + m;
    }
}

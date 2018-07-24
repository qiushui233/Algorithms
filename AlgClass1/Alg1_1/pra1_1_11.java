package AlgClass1.Alg1_1;

public class pra1_1_11 {
    public static void main(String[] args) {
        boolean[][] a = {{true,false},
                         {false,true,false}};

        String[][] res = new String[a.length][];

        for (int i = 0; i < a.length; i++) {
            res[i] = new String[a[i].length];
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == true){
                    res[i][j] = "*";
                }else {
                    res[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }

    }
}

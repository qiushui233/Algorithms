package AlgClass1.Alg1_1;

import java.util.Scanner;

public class pra1_1_9 {
    public static void main(String[] args) {
        String s = "";
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);
    }
}

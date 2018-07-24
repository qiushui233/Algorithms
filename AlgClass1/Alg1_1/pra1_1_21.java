package AlgClass1.Alg1_1;

import java.util.Scanner;

public class pra1_1_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = 0;

        c = (double) a / (double) b;

        System.out.printf("name:%s,%d,%d,%.3f",name,a,b,c);
    }
}

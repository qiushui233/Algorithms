package AlgClass1.Alg1_1;

import java.util.Scanner;

public class pra1_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && a == c && b == c){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}

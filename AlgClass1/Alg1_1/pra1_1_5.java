package AlgClass1.Alg1_1;

import java.util.Scanner;

public class pra1_1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if ((x >0 && x < 1)&& (y >0 && y < 1)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

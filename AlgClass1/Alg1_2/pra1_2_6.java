package AlgClass1.Alg1_2;

/**
 * 回环变位
 */
public class pra1_2_6 {

    public static void main(String[] args) {
        String a = "ACTGACG";
        String b = "TGACGAC";

        System.out.println(circular(a,b));
    }

    public static boolean circular(String a,String b){
        if (a.length() == b.length()){
            if (a.concat(a).indexOf(b) > 0 && b.concat(b).indexOf(a) > 0){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}

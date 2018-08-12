package AlgClass1.Alg1_3;


import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        FIFOQueue s = new FIFOQueue();

        for (int i = 0; i < 5; i++) {
            s.enqueue(i);
        }

        Iterator it = s.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }

        System.out.println(s.isEmpty());
        System.out.println(s.size());


        System.out.println(s.size());


    }
}

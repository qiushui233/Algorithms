package AlgClass1.Alg1_3;

public class FixedCapacityStackOfString {
    private String[] a;
    private int N;  //size
    FixedCapacityStackOfString(int cap){
        a = new String[cap];
    }
    public boolean isEmpty() {return N == 0;}
    public int size() {return N;}
    public void push(String item) {
        a[N++] = item;
    }
    public String pop(){
        return a[--N];
    }
    public boolean isFull() {return N >= a.length;}
}

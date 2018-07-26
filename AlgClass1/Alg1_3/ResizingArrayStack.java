package AlgClass1.Alg1_3;
/**
 * 下压（LIFO）栈 （能够动态调整数组大小的实现）
 */

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];
    private int N = 0;
    public boolean isEmpty() {return N == 0;}
    public int size() {return N;}

    public void resize(int max){
        //将栈移动到一个大小为max的新数组
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item item) {
        //将元素添加到栈顶
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop(){
        //从栈顶删除元素
        Item item = a[--N];
        a[N] = null;  //避免对象游离
        if (N > 0 && N == a.length/4) resize(a.length/2);
        return item;
    }



    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayTterator();
    }
    private  class ReverseArrayTterator implements Iterator<Item>{
        //支持后进先出的迭代
        private int i = N;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }
}

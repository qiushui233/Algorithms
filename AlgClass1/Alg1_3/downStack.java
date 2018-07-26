package AlgClass1.Alg1_3;


import java.util.Iterator;

/**
 * 下压堆栈（链表实现） 单向链表
 */
public class downStack<Item> implements Iterable<Item>{
    private Node first;
    private int N;

    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    public void push(Item o){
        //向栈顶添加元素
        Node oldfirst = first;
        first = new Node();
        first.item = o;
        first.next = oldfirst;
        N++;
    }

    public Object pop(){
        //从栈顶删除元素
        Item o = first.item;
        first = first.next;
        N--;
        return o;
    }
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}


package AlgClass1.Alg1_3;

import java.util.Iterator;

/**
 * 先进先出队列  Queue实现单向链表
 */
public class FIFOQueue<Item> implements Iterable<Item>{
    private Node first;
    private Node last;
    private int N;
    private class Node{
        //定义了结点的嵌套类
        Item item;
        Node next;
    }

    public boolean isEmpty() { return first == null; }
    private int size() {return N;}
    public void enqueue(Item item){
        //向表尾添加元素
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else            oldlast.next = last;
        N++;
    }

    public Item dequeue(){
        //从表头删除元素
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
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

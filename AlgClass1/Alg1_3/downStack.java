package AlgClass1.Alg1_3;


import edu.princeton.cs.algs4.Stack;

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

    public void push(Item item){
        //向栈顶添加元素
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop(){
        //从栈顶删除元素
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Stack<Item> copy(Stack<Item> s){
        Iterator<Item> it = s.iterator();
        Stack<Item> result = new Stack<Item>();
        Stack<Item> temp = new Stack<Item>();
        while (it.hasNext()) {
            temp.push(it.next());
        }
        it = temp.iterator();
        while (it.hasNext()) {
            result.push(it.next());
        }
        return result;

    }

    public Item peek(){
        return first.item;
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


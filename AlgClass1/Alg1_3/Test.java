package AlgClass1.Alg1_3;

import edu.princeton.cs.algs4.StdOut;

public class Test {
    public static void main(String[] args) {
        downStack stack = new downStack();
        stack.push("it");
        stack.push("was");
        StdOut.println(stack.pop());
        stack.push("the");
        stack.push("best");
        StdOut.println(stack.pop());
        stack.push("of");
        stack.push("times");
        StdOut.println(stack.pop());
        StdOut.println(stack.pop());
        StdOut.println(stack.pop());
        stack.push("it");
        stack.push("was");
        StdOut.println(stack.pop());
        stack.push("the");
        StdOut.println(stack.pop());
        StdOut.println(stack.pop());



//        while (!StdIn.isEmpty()){
//            String item = StdIn.readString();
//            if (!item.equals("-")) stack.push(item);
//            else if (!stack.isEmpty()) StdOut.print(stack.pop() + " ");
//        }
//        StdOut.println("(" + stack.size() + "left on stack");

    }
}

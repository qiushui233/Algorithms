package AlgClass1.Alg1_3;

public class pra1_3_9 {

    public static void main(String[] args) {
        String s = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        System.out.println(getCompleteExpression(s));
    }

    public static String getCompleteExpression(String exp){
        String[] p = exp.split(" ");
        downStack<String> opstack = new downStack();
        downStack<String> datastack = new downStack();
        for (int i = 0; i < p.length; i++) {
            if (isOperator(p[i])){
                opstack.push(p[i]);
            }else if (p[i].equals(")")){
                String d1 = datastack.pop();
                String d2 = datastack.pop();
                String op = opstack.pop();
                datastack.push("( " + d2 + " " + op + " "+ d1 + " )");
            }else {
                datastack.push(p[i]);
            }
        }
        return datastack.pop();
    }


    private static boolean isOperator(String s)
    {
        return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"));
    }
}

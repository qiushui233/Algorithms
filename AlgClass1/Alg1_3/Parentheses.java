package AlgClass1.Alg1_3;

/**
 * 从标准输入中读取一个文本流并使用栈判定其中的括号是否完整配对
 */
public class Parentheses {

    public static void main(String[] args) {
        String a = "[()]{}{[()()]()}";
        String b = "[{]}";

        System.out.println(isValid(a));
        System.out.println(isValid(b));
    }

    public static boolean isValid(String input){
        downStack<Character> par = new downStack<>();
        int i;
        for (i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '{' || c == '[' || c == '('){
                par.push(c);
            }else if (par.isEmpty()){
                break;
            }else if (c == '}'){
                if ('{' != par.pop()){
                    break;
                }
            }else if (c == ']'){
                if ('[' != par.pop()){
                    break;
                }
            }else if (c == ')'){
                if ('(' != par.pop()){
                    break;
                }
            }else {
                break;
            }
        }
        return (i == input.length() && par.isEmpty());
    }
}

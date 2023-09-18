import java.lang.reflect.Array;

public class BalancedParentheses {

    public static boolean balanceParentheses (String string){
        char[] chars = string.toCharArray();
        boolean closed = true;
        for (char letter : chars) {
            if (letter == '(' || letter == ')') {
                closed = !closed;
            }
        }
        return closed;

    }
}

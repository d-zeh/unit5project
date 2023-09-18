public class BalancedBrackets {

    public static boolean balancedBrackets(String string) {
        char[] chars = string.toCharArray();
        int i = 0;

        for (char letter : chars) {
            if (letter == '(' || letter == '{' || letter == '[' || letter == '<' ) {
                i++;
            } else if (letter == ')' || letter == '}' || letter == ']' || letter == '>' ) {
                i--;
            }
        }
        return i == 0;
    }
}

//For both step 1 and stepg 2, the run time complexities are O(n)
//For the provided solutions, both of the run times are also O(n)
//For the bracket one, I prefer my soltion. It seems to be more straight forward, simpler, and takes less space
//It would have to be changed, a queue used FIFO and a Stack is LIFO
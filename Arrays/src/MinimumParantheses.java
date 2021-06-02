import java.util.Stack;

/**
 * Problem Description
 *
 * Given a string A of parantheses ‘(‘ or ‘)’.
 *
 * The task is to find minimum number of parentheses ‘(‘ or ‘)’ (at any positions) we must add to make the resulting parentheses string valid.
 *
 * An string is valid if:
 *
 * Open brackets must be closed by the corresponding closing bracket.
 * Open brackets must be closed in the correct order.
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 *
 * A[i] = '(' or A[i] = ')'
 *
 *
 *
 * Input Format
 * First and only argument is an string A.
 *
 *
 *
 * Output Format
 * Return a single integer denoting the minimumnumber of parentheses ‘(‘ or ‘)’ (at any positions) we must add in A to make the resulting parentheses string valid.
 */

public class MinimumParantheses {

    public static void main(String[] args) {

        MinimumParantheses obj = new MinimumParantheses();

        System.out.println(obj.solve(")("));
    }

    public int solve(String A) {

        int counter = 0;
        int open = 0;

        for(char curr : A.toCharArray()) {

            if(curr == '(') {

                counter ++;
            }
            else if(curr == ')') {

                counter --;
            }

            if(counter < 0) {

                open ++;
                counter ++;
            }
        }

        return  counter + open;
    }
}

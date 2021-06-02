import java.util.ArrayList;
import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 *
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 */
public class ReversePolishNotation {

    public int evalRPN(ArrayList<String> A) {

        Stack<Integer> operandStack = new Stack<>();

        for(String curr : A) {

            //Ask to throw errors if notation is not right
            if(curr.equals("+")) {

                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();
                int total =  operand1 + operand2;
                operandStack.push(total);
            }
            else if(curr.equals("-")) {

                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();
                int total =  operand1 - operand2;
                operandStack.push(total);
            }
            else if(curr.equals("/")) {

                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();
                int total =  operand1 / operand2;
                operandStack.push(total);
            }
            else if(curr.equals("*")) {

                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();
                int total =  operand1 * operand2;
                operandStack.push(total);
            }
            else {

                operandStack.push(Integer.parseInt(curr));
            }
        }

        return operandStack.pop();
    }
}

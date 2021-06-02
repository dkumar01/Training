import java.util.Stack;

/*
Valid Subsequence
https://leetcode.com/problems/is-subsequence/
https://www.algoexpert.io/questions/Validate%20Subsequence
*/
public class IsSubSequence {

    public boolean isSubsequence(String s, String t) {

        Stack<Character> characterStack = new Stack<>();
        int sPointer = 0;

        if(s.isEmpty()) {

            return true;
        }

        for (int i = t.length() - 1; i >= 0; i--) {

            characterStack.push(t.charAt(i));
        }

        while (!characterStack.empty() && sPointer < s.length()) {

            char curr = characterStack.pop();

            if(curr == s.charAt(sPointer)) {

                sPointer++;

                if(sPointer >= s.length()) {

                    return true;
                }
            }
        }

        return false;
    }
}

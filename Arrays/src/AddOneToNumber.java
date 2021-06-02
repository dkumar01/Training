import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Given a non-negative number represented as an array of digits,
 *
 * add 1 to the number ( increment the number represented by the digits ).
 *
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * Example:
 *
 * If the vector has [1, 2, 3]
 *
 * the returned vector should be [1, 2, 4]
 *
 * as 123 + 1 = 124.
 */
public class AddOneToNumber {

    public static void main(String[] args) {

        ArrayList A = new ArrayList();
        A.add(0);

        System.out.println(addOneToNumber(A));
    }

    public static List<Integer> addOneToNumber(ArrayList<Integer> A) {

        int i = 0;

        for (i = A.size() - 1; i >= 0; i--) {

            int curr = A.get(i);
            if(curr == 9) {

                if(i == 0) {

                    A.set(0, 0);
                    A.add(0, 1);
                } else {

                    A.set(i, 0);
                }
            }
            else {

                A.set(i, (curr + 1));
                break;
            }
        }

        i = 0;
        while(i < A.size() && A.size() > 1) {

            if(A.get(i) == 0) {

                A.remove(i);
            }
            else {

                break;
            }
        }

        return A;
    }
}

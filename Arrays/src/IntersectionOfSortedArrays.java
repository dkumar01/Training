import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfSortedArrays {

    public static void main(String[] args) {

        IntersectionOfSortedArrays obj = new IntersectionOfSortedArrays();

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 3, 3, 7, 7, 8, 11, 11, 16, 17, 23, 23, 25, 29, 30, 32, 38, 39, 42, 42, 45, 49, 49, 51, 54, 54, 55, 55, 57, 57, 61, 62, 63, 63, 63, 65, 65, 66, 69, 70, 70, 71, 72, 78, 79, 79, 83, 84, 87, 89, 95, 100, 101, 101, 101 ));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 2, 3, 3, 4, 5, 6, 7, 8, 8, 9, 10, 12, 13, 15, 19, 20, 21, 21, 22, 22, 23, 32, 32, 33, 36, 37, 38, 40, 42, 46, 47, 49, 49, 50, 51, 52, 54, 58, 58, 59, 60, 62, 62, 63, 63, 66, 70, 72, 76, 77, 77, 78, 78, 78, 82, 84, 85, 92, 93, 94, 95, 101));

        System.out.println(obj.intersect(A, B));
    }

    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {

        ArrayList<Integer> duplicates = new ArrayList<>();

        int pointerA = 0;
        int pointerB = 0;


        //If params were not final I would only iterate over the smaller list
        while (pointerA < A.size() || pointerB < B.size()) {

            int aVal = A.get(pointerA);
            int bVal = B.get(pointerB);


            if(aVal < bVal) {
                pointerA++;
            }
            else if(bVal < aVal) {
                pointerB++;
            }
            else {

                duplicates.add(aVal);
                pointerA++;
                pointerB++;
            }

        }

        return duplicates;
    }
}

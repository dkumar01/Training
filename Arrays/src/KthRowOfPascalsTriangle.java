import java.util.ArrayList;

public class KthRowOfPascalsTriangle {

    public static void main(String[] args) {

        KthRowOfPascalsTriangle obj = new KthRowOfPascalsTriangle();


    }

    public ArrayList<Integer> getRow(int A) {

        ArrayList<Integer> returnList = new ArrayList<>();
        int prev = 1;
        returnList.add(prev);

        for (int i = 1; i <= A; i++) {

            int curr = (prev * (A - i + 1)) / i;
            returnList.add(curr);
            prev = curr;
        }

        return returnList;
    }
}

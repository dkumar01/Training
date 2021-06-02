import java.util.ArrayList;

public class RotateMatrix {

    public static void main(String[] args) {

        RotateMatrix rm = new RotateMatrix();
        int[][] a = {{1, 2},{3, 4}};

        int[][] result = rm.rotate(a);

        for (int[] ints : result) {

            for (int anInt : ints) {

                System.out.print(anInt);
            }
        }
    }

    public int[][] rotate(int[][] a) {

        int length = a.length;
        for(int i = 0; i < a.length; i++) {

            for(int j = i; j < length; j++) {

                //Storing left
                int swap = a[i][j];

                // Right to Left
                a[i][j] = a[length - i - 1][j];

                //Bottom to top right;
                a[length - i - 1][j] = a[length - i - 1][length - j - 1];

                //Bottom to bottom right
                a[length - i - 1][length - j - 1] = a[i][length - j - 1];

                a[i][length - j - 1] = swap;
            }
        }

        return a;
    }
}

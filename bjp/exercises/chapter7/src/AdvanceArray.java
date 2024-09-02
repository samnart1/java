import java.util.Arrays;

public class AdvanceArray {

    public static void main(String[] args) {
        int[] data1 = {
                1, 4, 7, 3, 9, 0, 5, 2, 8, 6,
                0, 3, 9, 5, 6, 7, 2, 8, 1, 4,
                5, 7, 3, 6, 2, 0, 9, 8, 1, 4,
                6, 2, 4, 9, 1, 8, 3, 7, 0, 5,
                7, 1, 6, 4, 9, 3, 0, 2, 5, 8
        };

//        shiftToTheLeftByOne(data1);
//        shiftToTheRightByOne(data1);
//        System.out.println(Arrays.toString(data1));

//        inversion(data1);

        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[6];
        System.out.println(Arrays.deepToString(jagged));
    }

    // NESTED LOOP ALGORITHMS
    // printing all inversions of an array
    public static void inversion(int[] data) {
        int count = 0;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    System.out.printf("(%d, %d)\n", data[i], data[j]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    // ARRAYS OF OBJECTS




    // SHIFTING VALUES IN AN ARRAY [TO THE LEFT AND TO THE RIGHT]
//    public static void shiftToTheRightByOne(int[] data) {
//        // int[] haha = {1, 3, 5, 6, 7, 8};
//        int last = data[data.length - 1];
//        for (int i = data.length - 1; i > 0; i--) {
//            data[i] = data[i - 1];
//        }
//        data[0] = last;
//    }

//    public static void shiftToTheLeftByOne(int[] data) {
//        int first = data[0];
//        for (int i = 0; i < data.length - 1; i++) {
//            data[i] = data[i + 1];
//        }
//        data[data.length - 1] = first;
//    }
}

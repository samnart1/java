public class ArrayTraversal {

    public static void main(String[] args) {
        int[] data = {
                1, 4, 7, 3, 9, 0, 5, 2, 8, 6,
                0, 3, 9, 5, 6, 7, 2, 8, 1, 4,
                5, 7, 3, 6, 2, 0, 9, 8, 1, 4,
                6, 2, 4, 9, 1, 8, 3, 7, 0, 5,
                7, 1, 6, 4, 9, 3, 0, 2, 5, 8
        };
        int count = count(data, 2);
        System.out.println(count);
    }


    // SEARCHING AND REPLACING
    public static int count(int[] data, int target) {
        int count = 0;

        for (int n : data) {
            if (n == target) {
                count++;
            }
        }

        return count;
    }
}




// PRINTING AN ARRAY:
// 1. For each loop
// 2. for loop
// 3. System.out.println(Arrays.toString(array);
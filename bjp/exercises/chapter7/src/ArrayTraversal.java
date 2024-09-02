import java.util.Arrays;

public class ArrayTraversal {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 2, 17};
//        int[] data1 = {
//                1, 4, 7, 3, 9, 0, 5, 2, 8, 6,
//                0, 3, 9, 5, 6, 7, 2, 8, 1, 4,
//                5, 7, 3, 6, 2, 0, 9, 8, 1, 4,
//                6, 2, 4, 9, 1, 8, 3, 7, 0, 5,
//                7, 1, 6, 4, 9, 3, 0, 2, 5, 8
//        };

//        int[] data2 = {
//                1, 4, 7, 3, 9, 0, 5, 2, 8, 6,
//                0, 3, 9, 5, 6, 7, 2, 8, 1, 4,
//                5, 7, 3, 6, 2, 0, 9, 8, 1, 4,
//                6, 2, 4, 9, 1, 8, 3, 7, 0, 5,
//                7, 1, 6, 4, 9, 3, 0, 2, 5, 0
//        };

        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
        Arrays.stream(numbers).forEach(System.out::println);

//        reverse(data1);
//        reverse(data2);
//        System.out.println(Arrays.toString(data1));

//        String word = "Mississippi";
//        String reverse = reverse(word);
//        System.out.printf("reverse of Mississippi is: %s", reverse);

    }

    // STRING TRAVERSAL ALGORITHMS
//    public static String reverse(String word) {
//        String result = "";
//
//        for (int i = 0; i < word.length(); i++) {
//            result = word.charAt(i) + result;
//        }
//
//        return result;
//    }

//    public static int count(String word) {
//        int count = 0;
//
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == 'i'){
//                count++;
//            }
//        }
//
//        return count;
//    }

    // REVERSING AN ARRAY
//    public static void reverse(int[] data) {
//        for (int i = 0; i < data.length / 2; i++) {
//            int j = data.length - i - 1;
//            swap(data, i, j);
//        }
//    }

//    public static void swap(int[] data, int i, int j) {
//        int temp;
//        temp = data[i];
//        data[i] = data[j];
//        data[j] = temp;
//    }

    // TESTING FOR ARRAY EQUALITY
//    public static boolean equals(int[] data1, int[] data2) {
//
//        // check for equal length
//        if (data1.length != data2.length) {
//            return false;
//        }
//
//        // check for equal elements at i
//        for (int i = 0; i < data1.length; i++) {
//            if (data1[i] != data2[i]) {
//                return false;
//            }
//        }
//        return true;
//    }


    // SEARCHING AND REPLACING
//    public static int count(int[] data, int target) {
//        int count = 0;
//
//        for (int n : data) {
//            if (n == target) {
//                count++;
//            }
//        }
//
//        return count;
//    }

//    public static void replace(int[] data, int target, int replacement) {
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] == target) {
//                data[i] = replacement;
//            }
//        }
//    }
}




// PRINTING AN ARRAY:
// 1. For each loop
// 2. for loop
// 3. System.out.println(Arrays.toString(array);
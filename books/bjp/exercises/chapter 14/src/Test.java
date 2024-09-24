import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

        System.out.println(isPalindrome(1001));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String str = "";
        for (int i = 0; i < number.length(); i++) {
            str = number.charAt(i) + str;
        }

        return str.equals(number);
    }
}

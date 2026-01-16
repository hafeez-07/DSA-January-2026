
public class RotateArray {

    public static void rotate(int nums[], int k) {

        if (nums.length <= 1) {
            return;
        }

        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int nums[], int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;

        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
    }
}

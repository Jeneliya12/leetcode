import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Step 1: Compute left product for each element
        output[0] = 1; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Step 2: Compute right product and multiply with left product
        int right = 1; // No elements to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= right; // Multiply with the right product
            right *= nums[i]; // Update right product
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.println("Product of array except self: " + Arrays.toString(result));
    }
}

package week4;
import java.util.*;
public class Subarray_sum_equals_k {
    static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);
        int currentSum = 0;
        int count = 0;
        for (int num : nums) {
            currentSum += num;
            count += prefixCount.getOrDefault(currentSum - k, 0);
            prefixCount.put(
                    currentSum,
                    prefixCount.getOrDefault(currentSum, 0) + 1
            );
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.println("Number of subarrays: " +subarraySum(nums, k));
        sc.close();
    }
}

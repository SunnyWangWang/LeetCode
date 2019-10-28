package Arrays;

/* Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum
 * and return its sum.
 */

/* IDEA: Greedy algo, keep it a cur_sum and max_sum
 *  - time Complexity: O(n) as one pass along the array
 *  - space complexity: O(1) as constant space solution
*/


public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        // can't init to 0 as the max sub array may be negative
        int cur_sum = nums[0];
        int max_sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // cur_sum compare i'th and (i+ (i+1))'th element to make achieve "contiguous"
            cur_sum  = Math.max(nums[i], nums[i] + cur_sum);
            max_sum = Math.max(cur_sum, max_sum);   
        }
        return max_sum;
        
    }
}

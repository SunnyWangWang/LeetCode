package Arrays;
import java.util.*;

/* Description: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice. 
 */

/* IDEA: use "HashMap" in java, which is one-pass
 * - time complexity: O(n) to traverse the list, O(1) to look up in the hashmap.
 * - Space complexity: O(n) based on the elements stored.
 */

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		   
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (temp.containsKey(complement)){
                return new int[] {i, temp.get(complement)};
            }
            temp.put(nums[i], i); 
        }
        
        // throw run time solution
        throw new IllegalArgumentException("No such a solution");
    }
}

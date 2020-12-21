/*
 * 1. TWO SUM 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Solved in O(n)
*/

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        List<Integer> num2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            num2.add(nums[i]);
        }
        for (int j = 0; j < nums.length; j++) {
            int left = target - nums[j];
            if (num2.contains(left)) {
                sol[0] = j;
                sol[1] = num2.indexOf(left);
                if (ans[0] != ans[1]) {
                    return ans;
                }
            }
        }
        return ans;
    }
}

/*
 *485. MAX CONSECUTIVES ONES 
 *Given a binary array, find the maximum number of consecutive 1s in this array.


    Solved in O(n)
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count += 1;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;

    }
}

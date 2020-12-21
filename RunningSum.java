/*
 *
 *  1480. Running Sum of 1d Array
 *   Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).   
 *   
 *  Solved in O(n)  
*/
class Solution {
    public int[] runningSum(int[] nums) {
        int runSum = 0;
        int[] sol = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            runSum += nums[i];
            sol[i] = runSum;

        }

        return sol;
    }
}

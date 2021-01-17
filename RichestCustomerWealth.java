import org.graalvm.compiler.replacements.amd64.AMD64CountLeadingZerosNode;

/*
* 1672. Richest Customer Wealth
*
* You are given an m x n integer grid accounts where accounts[i][j] 
* is the amount of money thw ith customer has in the jth bank. 
* Return the wealth that the richest customer has. 
*/

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int current = 0;
        int highest = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                current += accounts[i][j];
            }

            if (current > highest) {
                highest = current;
            }

        }
        return highest;
    }
}

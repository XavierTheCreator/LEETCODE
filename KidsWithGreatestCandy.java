import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandy {
    /*
     * 1431. Kids With the Greatest Number of Candies Given the array candies and
     * the integer extraCandies, where candies[i] represents the number of candies
     * that the ith kid has. For each kid check if there is a way to distribute
     * extraCandies among the kids such that he or she can have the greatest number
     * of candies among them. Notice that multiple kids can have the greatest number
     * of candies.
     * 
     * Solved in O(n)
     */
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> sol = new ArrayList<>();
            int max = 0;
            for (int i : candies) {
                if (i > max) {
                    max = i;
                }
            }

            for (int i = 0; i < candies.length; i++) {
                if (candies[i] + extraCandies >= max) {
                    sol.add(true);
                } else {
                    sol.add(false);
                }
            }
            return sol;

        }
    }
}

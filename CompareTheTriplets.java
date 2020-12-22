public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int alice = 0;
        int bob = 0;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            }
            if (a.get(i) < b.get(i)) {
                bob++;
            }
            if (a.get(i) == b.get(i)) {

            }
        }
        ans.add(alice);
        ans.add(bob);
        return ans;

    }
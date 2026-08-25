class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int m = candies[0];

        
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > m) {
                m = candies[i];
            }
        }

        List<Boolean> arr = new ArrayList<>();

       
        for (int i = 0; i < candies.length; i++) {
            int s = candies[i] + extraCandies;
            arr.add(s >= m);
        }

        return arr;
    }
}
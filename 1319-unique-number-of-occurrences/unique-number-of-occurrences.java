class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         // Step 1: Count frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check whether frequencies are unique
        HashSet<Integer> set = new HashSet<>();

        for (int frequency : map.values()) {

            if (set.contains(frequency)) {
                return false;
            }

            set.add(frequency);
        }

        return true;
        
    }
}
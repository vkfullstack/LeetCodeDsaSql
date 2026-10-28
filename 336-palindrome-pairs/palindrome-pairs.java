

class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int n = word.length();

            for (int j = 0; j <= n; j++) {
                String left = word.substring(0, j);
                String right = word.substring(j);

                // Case 1: Reverse of left part exists
                if (isPalindrome(right)) {
                    String revLeft = new StringBuilder(left)
                            .reverse().toString();

                    if (map.containsKey(revLeft)) {
                        int k = map.get(revLeft);

                        if (k != i) {
                            result.add(Arrays.asList(i, k));
                        }
                    }
                }

                // Case 2: Reverse of right part exists
                if (j > 0 && isPalindrome(left)) {
                    String revRight = new StringBuilder(right)
                            .reverse().toString();

                    if (map.containsKey(revRight)) {
                        int k = map.get(revRight);

                        if (k != i) {
                            result.add(Arrays.asList(k, i));
                        }
                    }
                }
            }
        }

        return result;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

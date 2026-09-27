class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> charset = new HashSet<>();

        int left = 0;
        int maxlength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (charset.contains(s.charAt(right))) {
                charset.remove(s.charAt(left));
                left++;
            }

            charset.add(s.charAt(right));

            maxlength = Math.max(maxlength, right - left + 1);
        }

        return maxlength;
    }
}
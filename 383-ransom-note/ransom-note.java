class Solution {

    public boolean canConstruct(String r, String m) {

        int[] v = new int[26];

        for (int i = 0; i < r.length(); i++) {
            v[r.charAt(i) - 'a']++;
        }

        for (int i = 0; i < m.length(); i++) {
            v[m.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (v[i] > 0) {
                return false;
            }
        }

        return true;
    }
}
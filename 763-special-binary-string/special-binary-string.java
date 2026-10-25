
class Solution {
    public String makeLargestSpecial(String s) {
        List<String> parts = new ArrayList<>();
        int count = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                count--;
            }

            // Found a complete special substring
            if (count == 0) {
                String inner = s.substring(start + 1, i);
                String special = "1"
                        + makeLargestSpecial(inner)
                        + "0";

                parts.add(special);
                start = i + 1;
            }
        }

        // Sort in descending lexicographical order
        parts.sort(Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(part);
        }

        return result.toString();
    }
}

import java.util.HashSet;

class Solution {

    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {

            set.add(n);

            int no = n;
            int s = 0;

            while (no > 0) {

                int r = no % 10;
                s = s + r * r;
                no = no / 10;
            }

            n = s;
        }

        if (n == 1) {
            return true;
        }

        return false;
    }
}
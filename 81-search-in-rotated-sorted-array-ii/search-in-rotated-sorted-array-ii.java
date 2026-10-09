class Solution {
    public boolean search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target) {
                return true;
            }

            // Handle duplicates
            if (arr[s] == arr[m] && arr[m] == arr[e]) {
                s++;
                e--;
            }
            // Left half is sorted
            else if (arr[s] <= arr[m]) {
                if (target >= arr[s] && target < arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
            // Right half is sorted
            else {
                if (target > arr[m] && target <= arr[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }

        return false;
    }
}
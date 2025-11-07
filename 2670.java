import java.util.*;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];
        int[] suffixCount = new int[n];
        Set<Integer> suffix = new HashSet<>();
        for (int i = n - 2; i >= 0; i--) {
            suffix.add(nums[i + 1]);
            suffixCount[i] = suffix.size();
        }
        Set<Integer> prefix = new HashSet<>();
        for (int i = 0; i < n; i++) {
            prefix.add(nums[i]);
            diff[i] = prefix.size() - suffixCount[i];
        }

        return diff;
    }
}

class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int valid = 0;

        for (int start = 0; start < n; start++) {
            if (nums[start] == 0) {
               
                int[] temp = new int[n];
                for (int i = 0; i < n; i++) temp[i] = nums[i];
                if (simulate(temp, start, 1)) valid++;

               
                for (int i = 0; i < n; i++) temp[i] = nums[i];
                if (simulate(temp, start, -1)) valid++;
            }
        }

        return valid;
    }

    private boolean simulate(int[] nums, int curr, int dir) {
        int n = nums.length;

        while (curr >= 0 && curr < n) {
            if (nums[curr] == 0) {
                curr += dir;
            } else {
                nums[curr]--;
                dir = -dir;  
                curr += dir;
            }
        }


        for (int num : nums) {
            if (num != 0) return false;
        }
        return true;
    }
}

class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    void mergeSort(int[] arr, int L, int R) {
        if (L >= R) return;

        int mid = (L + R) / 2;

        mergeSort(arr, L, mid);
        mergeSort(arr, mid + 1, R);

        merge(arr, L, mid, R);
    }

    void merge(int[] arr, int L, int n, int R) {
        int[] temp = new int[R - L + 1];
        int i = L, j = n + 1, k = 0;

        while (i <= n && j <= R) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        while (i <= n) temp[k++] = arr[i++];
        while (j <= R) temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++) {
            arr[L + x] = temp[x];
        }
    }
}

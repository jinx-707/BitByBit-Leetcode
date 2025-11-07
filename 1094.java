class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] stops = new int[1001];  
        
        for (int[] t : trips) {
            stops[t[1]] += t[0];  
            stops[t[2]] -= t[0];  
        }

        int passengers = 0;
        for (int n : stops) {
            passengers += n;
            if (passengers > capacity) return false;
        }

        return true;
    }
}

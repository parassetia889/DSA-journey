class Solution {

    public static boolean checkWeight(int[] weights, int maxWeight, int days) {
        int daysRequired = 1;
        int currentWeight = 0;

        for (int weight : weights) {
            if (currentWeight + weight <= maxWeight) {
                currentWeight += weight;
            } else {
                daysRequired++;
                currentWeight = weight;
                if (daysRequired > days) {
                    return false;
                }
            }
        }
        return true;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        int ans = high;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (checkWeight(weights, mid, days)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}

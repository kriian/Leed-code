package start.task1672;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int cash : account) {
                sum += cash;
            }
            if (sum > maxSum) maxSum = sum;
        }
        return maxSum;
    }
}

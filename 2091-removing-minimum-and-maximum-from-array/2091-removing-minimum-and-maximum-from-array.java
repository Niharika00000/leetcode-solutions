class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        // Find indices of min and max
        for (int i = 1; i < n; i++) {

            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Both from front
        int front = Math.max(minIndex, maxIndex) + 1;

        // Both from back
        int back = n - Math.min(minIndex, maxIndex);

        // Min from front, max from back
        int frontBack = (minIndex + 1) + (n - maxIndex);

        // Max from front, min from back
        int backFront = (maxIndex + 1) + (n - minIndex);

        return Math.min(
                Math.min(front, back),
                Math.min(frontBack, backFront)
        );
    }
}
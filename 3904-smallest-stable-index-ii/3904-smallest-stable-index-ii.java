class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suffixmin = new int[nums.length];
        suffixmin[nums.length-1] = nums[nums.length-1];
        for(int i= n-2;i>=0;i--){
            suffixmin[i] = Math.min(suffixmin[i+1],nums[i]);
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max= Math.max(nums[i],max);

            if(max-suffixmin[i]<=k){
                return i;
            }
        }
        return -1;
    }
}
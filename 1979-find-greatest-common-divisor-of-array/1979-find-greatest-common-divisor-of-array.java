class Solution {
    public int findGCD(int[] nums) {
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        int divisor = 1;
       for (int i = 0;i<nums.length;i++){
        if(nums[i]>mx)mx = nums[i];
        if(nums[i]<mn) mn = nums[i];
       }
       for(int i = 1;i<=mn;i++){
        if(mx%i==0 && mn%i==0){
            divisor = i;
        }
       }
       return divisor;
    }
}
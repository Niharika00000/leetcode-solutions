class Solution {
    
    public int minMoves(int[] nums) {
        // int largest = nums[0];
        int steps=0;
        int sub = 0;
        
       Arrays.sort(nums);
        int n = nums.length;
       
      for(int i=0;i<n;i++){
if(nums[i]!=nums[n-1]){
    sub = nums[n-1]-nums[i];
    steps=steps+sub;
    
}


       } 
       return steps;
    }
}
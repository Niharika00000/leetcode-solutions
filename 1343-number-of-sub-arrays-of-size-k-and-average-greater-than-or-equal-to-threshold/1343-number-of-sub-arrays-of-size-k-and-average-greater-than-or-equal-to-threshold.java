class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int current = 0;
       int sum = 0;
       for(int i = 0;i<k;i++){
        
        current+=arr[i];
       
       } 
       if((current/k)>=threshold)
       sum++;
       int max= current;
       for(int i=1;i<=arr.length-k;i++){
        current = current-arr[i-1]+arr[i+k-1];
        if((current/k)>=threshold){
            sum++;
        }
       }
       return sum;

    }
}
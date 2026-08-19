import java.util.HashMap;
class Solution {
    public int findLucky(int[] arr) {
        int ln = -1;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == freq.get(arr[i]) && arr[i]>=ln){
               ln = arr[i];

            }
        }
        return ln;
    }
}
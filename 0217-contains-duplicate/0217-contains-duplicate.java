class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> freq = new HashMap<>();
            for(int num:nums){
                freq.put(num,freq.getOrDefault(num,0)+1);

                if(freq.get(num)>1){
                    return true;
                }
                
            }
            // for(int key:freq.keySet()){
            //      if(freq.get(key)>1)
            //         return true;
                
            // }
            
        return false;
        
    }
}
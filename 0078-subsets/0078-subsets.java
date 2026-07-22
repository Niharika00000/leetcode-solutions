class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        /*create the list to store all the subsets

        create an empty list to build the current subset
        */

        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;

        
    
    }

    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>>result){
result.add(new ArrayList<>(current));

for(int i=start;i<nums.length;i++){
    current.add(nums[i]);
    backtrack(nums,i+1,current,result);
    current.remove(current.size()-1);
}
    }
}
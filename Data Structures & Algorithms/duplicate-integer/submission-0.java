class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mapped = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(mapped.contains(nums[i])){
                return true;
            }
            else{
                mapped.add(nums[i]);
            }
        }

        return false;
    }
}
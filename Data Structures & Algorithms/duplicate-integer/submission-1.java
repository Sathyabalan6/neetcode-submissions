class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> dup = new HashMap<Integer,Integer>();

        for(int i= 0 ; i < nums.length; i++){
            if(dup.containsKey(nums[i])){
                return true;
            }
            else{
                dup.put(nums[i],1);
            }
            System.out.println(nums[i]);
        }
        return false;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i =0; i < nums.length - 1; i++){
        //     for(int j = i + 1 ; j<nums.length; j++){
        //         int total = nums[i] + nums[j];
        //         if(total == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{0,0};

        HashMap<Integer,Integer> sum = new HashMap<Integer,Integer>();
        for(int i =0 ; i< nums.length; i++){
            int diff = target - nums[i];
            if(sum.containsKey(diff)){
                return new int[]{sum.get(diff),i};
            }
            sum.put(nums[i],i);
        }

        return new int[]{0,0};
    }
}

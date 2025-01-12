class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indicies = {0,0};
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    indicies[0] = i;
                    indicies[1] = j;
                    return indicies;
                }
            }
        }
        return null;
    }
}
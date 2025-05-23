class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                int[] arr = {map.get(complement), i};
                return arr;
            }
            else{
            map.put(nums[i], i);
            }
        }
        return null;
    }
}
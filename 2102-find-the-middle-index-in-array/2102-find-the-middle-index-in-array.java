class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        for(int i=0; i < nums.length; i++){
            totalSum += nums[i];
        }
        int leftSum = 0;
        for(int i=0; i < nums.length;i++){
        if(totalSum - nums[i] == (2 * leftSum)){
            return i;
        }
        leftSum += nums[i];
    }
        return -1;
}
}
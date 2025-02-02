class Solution {
    
    public int findMiddleIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
             //                   [2,3,-1,8,4]
        for(int i=0; i < nums.length; i++){
            leftSum += nums[i];
            rightSum = 0;
            for(int j=i+1; j < nums.length; j++){
                rightSum += nums[j];
            }
            if((leftSum - nums[i]) == rightSum) return i;
        }
    return -1;
    }
}
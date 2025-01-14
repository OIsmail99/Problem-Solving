class Solution {
    public int findMiddleIndex(int[] nums) {
        int prefixSum = 0;
        int suffixSum = 0;
        for(int i=0; i < nums.length;i++){
            prefixSum += nums[i];
            suffixSum = 0;
            for(int j = i; j < nums.length; j++){
                suffixSum += nums[j];
            }
            if(prefixSum == suffixSum) return i;
        }
        return -1;
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        //kadane's Algorithm
        //         Start with max_current and max_global set to the first element of the   array.
        
        // For each element in the array:
        
        // Decide whether to start a new subarray at the current element or continue the existing subarray.
        
        // Update max_current accordingly.
        
        // Update max_global if max_current is greater.
        
        // After iterating through the array, max_global will contain the maximum subarray sum.
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];
        for(int i=1; i < nums.length; i++){
            if(nums[i] > maxCurrent + nums[i]){
                maxCurrent = nums[i]; //creating a new subarray
            }
            else{
                maxCurrent += nums[i]; //continuing on the current subarray
            }

            //max subarray sum so far
            if(maxCurrent > maxGlobal) maxGlobal = maxCurrent; 
        }
        return maxGlobal;
    }
}
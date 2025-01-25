class Solution {
    public int removeDuplicates(int[] nums) {
         int uniqueIndex = 0;
        int uniqueVal = nums[0];
        for(int i=1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                uniqueIndex++;
                uniqueVal = nums[i];
                nums[uniqueIndex] = uniqueVal;
            }
        }
        return uniqueIndex+1;
    }
}
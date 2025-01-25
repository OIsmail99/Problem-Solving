class Solution {
    public int removeDuplicates(int[] nums) {
        // uniqueIndex advances with each unique element added to the beginning.
        // uniqueVal: the first element in a series of duplicates.
        int uniqueIndex = 0;
        int uniqueVal = nums[0]; 
        for(int i=1; i < nums.length; i++){
            if(nums[i] != uniqueVal){
                uniqueVal = nums[i];
                uniqueIndex++;
                nums[uniqueIndex] = uniqueVal;
            }
        }
        return uniqueIndex+1;
    }
}
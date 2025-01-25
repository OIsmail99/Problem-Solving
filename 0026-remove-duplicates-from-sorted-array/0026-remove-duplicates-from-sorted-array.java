class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueIndex = 0;
        int currentVal = nums[0]; 
        for(int i=1; i < nums.length; i++){
            if(nums[i] != currentVal){
                currentVal = nums[i];
                uniqueIndex++;
                nums[uniqueIndex] = currentVal;
            }
        }
        return uniqueIndex+1;
    }
}
class Solution {
    public static void bubbleSort(int[] nums){
        for(int i=0; i < nums.length - 1; i++){
            boolean flag = false;
            for(int j=0; j < nums.length -1 - i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
    public int thirdMax(int[] nums) {
       int max = Integer.MIN_VALUE;
       int secMax = Integer.MIN_VALUE;
       int thirdMax = Integer.MIN_VALUE; 
       boolean isFound = false;
       for(int i =0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
       }
       for(int i =0; i < nums.length; i++){
            if(nums[i] < max && nums[i] > secMax ){
                secMax = nums[i];
            }
       }
       for(int i =0; i < nums.length; i++){
            if(nums[i] < secMax && nums[i] >= thirdMax ){
                isFound = true;
                thirdMax = nums[i];
            }
       }
       
       if(!isFound) return max;
    //    if(nums.length < 3) return max;
    //    if(thirdMax == secMax) return max;
       return thirdMax;
}
}
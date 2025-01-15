class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = Integer.MIN_VALUE;
        
        for(int i=0; i < k; i++){ //sum of initial window
            sum += nums[i];
        }
        int left = 0;
        int right = k - 1;
        while(right <= nums.length -1){
        if(left != 0){
        sum = (sum + nums[right]) - nums[left-1];
        }
        double average = sum / k;
        if(average > max) max = average;
        right++;
        left++;
        }
        return max;
    }
}
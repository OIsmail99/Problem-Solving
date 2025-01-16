class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int left = 0;
        int right = k - 1;
        
        for(int i=0; i < k; i++){ //sum of initial window
            sum += nums[i];
        }
        //double average = sum / k;
        double max = sum;
        
        while(right <= nums.length -1){
        if(left != 0){
        sum = (sum + nums[right]) - nums[left-1];
        }
        if(sum > max) max = sum;
        right++;
        left++;
        }
        return max/k;
    }
}
class Solution {
    private static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        //1) reverse the entire array
        //2) reverse the first k elements
        //3) reverse the last elements
        reverse(nums, 0, nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k, nums.length-1);
    }
}
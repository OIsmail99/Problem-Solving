class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] arr = new int[nums.length];
        int startingPos = nums.length - k;
        int j = 0;
        for(int i=startingPos; i < nums.length; i++){
            arr[j] = nums[i];
            j++;
        } //adding the rotated chunk to the beginning.
        //j now is one index after the chunk.
        System.out.println(Arrays.toString(arr));
        int x=0;
        for(int i=j; i < arr.length; i++){
            if(x == startingPos) 
            {
                break;
            }
            arr[i] = nums[x];
            x++; 
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0; i < nums.length; i++){
            nums[i] = arr[i];
        }
    }
}
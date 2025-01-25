class Solution {
    private static int[] merge(int[] arr1, int[] arr2){
        int[] newArr = new int[arr1.length + arr2.length];
        int left = 0; //for arr1;
        int right = 0; //for arr2;
        int index = 0; //for newArr;
        while(left < arr1.length && right < arr2.length){
            if(arr1[left] < arr2[right]){
                newArr[index] = arr1[left];
                left++;
            }
            else{
                newArr[index] = arr2[right];
                right++;
            }
            index++;
        }
        while(left < arr1.length){
            newArr[index] = arr1[left];
            left++;
            index++;
        }
        while(right < arr2.length){
            newArr[index] = arr2[right];
            right++;
            index++;
        }
        return newArr;
    }
    public int[] sortArray(int[] nums) {
        if(nums.length == 1) return nums;
        int midIndex = nums.length / 2;
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, midIndex));
        int[] right = sortArray(Arrays.copyOfRange(nums, midIndex, nums.length));
        return merge(left,right);
    }
}
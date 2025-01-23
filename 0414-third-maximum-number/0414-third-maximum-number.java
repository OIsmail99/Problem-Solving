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
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        Integer[] treeArr = set.toArray(new Integer[0]);
        if(treeArr.length >= 3) return treeArr[treeArr.length - 3];
        return treeArr[treeArr.length -1];
}
}
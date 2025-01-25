class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int counter = 1;
        int max = 0;
        Integer arr[] = set.toArray(new Integer[set.size()]);
        // System.out.println(Arrays.toString(arr));
        
        for(int i=0; i < arr.length -1 ; i++){
            if(arr[i+1] - arr[i] == 1){
                counter++;
            }
            else{
                if(counter > max){
                    max = counter;
                }
                counter = 1;
            }
        }
        if(counter > max) max = counter;
        return max;
    }
}
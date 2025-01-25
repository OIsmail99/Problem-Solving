class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int counter = 1;
        int max = 0;
        Integer arr[] = set.toArray(new Integer[set.size()]);
        // System.out.println(Arrays.toString(arr));
        int currentNum = 0;
        for(Integer num: set){
            if(!set.contains(num -1)){
                counter = 1;
                currentNum = num;
            while(set.contains(currentNum + 1)){
                currentNum++;
                counter++;
            }
            }
            if(counter > max) max = counter;
        }
        return max;
    }
}
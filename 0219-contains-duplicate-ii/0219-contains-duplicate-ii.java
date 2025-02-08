class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0; i < nums.length; i++){
        if(map.containsKey(nums[i])){ //i=2
            //[1,0,1,1]
            int j = map.get(nums[i]); //j=9
            if(i - j <= k){
                return true;
                }
            // else{
            //     map.put(nums[i], i);
            // }

        // }
        // else
       }
            map.put(nums[i], i);//[1:0,0:1]
       }
        
       return false;
    }
}
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> evenMap = new HashMap<>();
        //frequency map of even elements and their counter
        for(int i=0; i < nums.length;i++){
            if(nums[i] % 2 == 0){
                evenMap.put(nums[i], evenMap.getOrDefault(nums[i], 0) + 1);
            }
        }
        if(evenMap.isEmpty()) return -1;

        int mostFreq = 0;
        int element = 0;
        for(Map.Entry<Integer,Integer> entry: evenMap.entrySet()){
            if(entry.getValue() > mostFreq){
                mostFreq = entry.getValue();
                element = entry.getKey();
            }
            if(entry.getValue() == mostFreq){
                if(entry.getKey() < element) element = entry.getKey();
            }
        }
        return element;
    }
}
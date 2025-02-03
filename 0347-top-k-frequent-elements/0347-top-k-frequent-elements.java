class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] mostFreq = new int[k];
        //frequency map of numbers
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        //max heap, to store the most frequent elements
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a,b) -> map.get(b) - map.get(a)
        );
        maxHeap.addAll(map.keySet());
        int i = 0;
        while(k != 0){
            int num = maxHeap.remove();
            mostFreq[i] = num;
            i++;
            k--;
        }
        return mostFreq;
    }
}
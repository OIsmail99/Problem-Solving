class Solution {
    public String frequencySort(String s) {
        // char[] sortedArr = s.toCharArray();
        // Arrays.sort(sortedArr);
        // return String.valueOf(sortedArr);
        //1) build a frequency map
        //2) use a priority queue and put the most prioritized characters (the ones with the highest frequency) at the front.
        //3) Use a string builder to build your string, and return its toString.

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i < s.length(); i ++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (a,b)-> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());
        StringBuilder string = new StringBuilder();
        while(!maxHeap.isEmpty()){
            char c = maxHeap.remove();
            int frequency = map.get(c);
            for(int i=0; i < frequency; i++){
                string.append(c);
            }
        }
        return string.toString();
    }
}
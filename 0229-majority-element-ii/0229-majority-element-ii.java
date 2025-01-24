class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() > (nums.length /3)){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
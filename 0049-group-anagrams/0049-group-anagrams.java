class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //sort words
        List<List<String>> group = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        //map of sorted word and its anagrams
        for(int i=0; i < strs.length; i++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String sortedWord = new String(charArr);
            if(map.containsKey(sortedWord)){
                List<String> list = map.get(sortedWord);
                list.add(strs[i]);
                map.put(sortedWord,list);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedWord,list);
            }
        }
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            group.add(entry.getValue());
        }
        return group;
    }
}
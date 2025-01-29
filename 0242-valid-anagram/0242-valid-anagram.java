class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()) return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        for(int i=0; i < s.length();i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i < t.length();i++){
            if(!sMap.containsKey(t.charAt(i))) return false;
            int counter = sMap.get(t.charAt(i));
            counter--;
            sMap.put(t.charAt(i),counter);
        }
        for(Integer count: sMap.values()){
            if(count != 0) return false;
        }
        return true;
    }
}
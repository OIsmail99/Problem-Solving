class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> charCounter = new HashMap<>();
        for(int i=0; i< s.length(); i++){
      charCounter.put(s.charAt(i), charCounter.getOrDefault(s.charAt(i),0) +1);
      charCounter.put(t.charAt(i), charCounter.getOrDefault(t.charAt(i),0) -1);
        }
        for(Integer count: charCounter.values()){
            if(count != 0) return false;
        }
        return true;
}
}
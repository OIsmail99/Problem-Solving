class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        Map<Character,Integer> rMap = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
        char c = ransomNote.charAt(i);
        rMap.put(c, rMap.getOrDefault(c, 0) + 1);
        }
        
        Map<Character,Integer> mMap = new HashMap<>();
        
        for (int i = 0; i < magazine.length(); i++) {
        char c = magazine.charAt(i);
        mMap.put(c, mMap.getOrDefault(c, 0) + 1);
        }

        Character[] charSet = rMap.keySet().toArray(new Character[0]); //charset of ransom note map
        //System.out.println(Arrays.toString(charSet));
        for(int i=0; i < charSet.length ;i++){
            if(mMap.containsKey(charSet[i])){
                if(mMap.get(charSet[i]) < rMap.get(charSet[i])) return false;
            }
            else{
                return false;
            }
        }
        return true;

    }
}
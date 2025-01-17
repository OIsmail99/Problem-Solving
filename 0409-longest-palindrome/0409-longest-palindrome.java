class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){ //building a frequency hashamp
            if(map.containsKey(s.charAt(i))){
                int counter = map.get(s.charAt(i));
                counter++;
                map.put(s.charAt(i), counter);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        int even_counter = 0;
        int odd_counter = 0;
        boolean isOdd = false;
        Character[] chars = map.keySet().toArray(new Character[0]);
        for(int i = 0; i < chars.length; i++){
            if(map.get(chars[i]) % 2 == 0){
                even_counter += map.get(chars[i]);
            }
            if(map.get(chars[i]) % 2 != 0){
                even_counter += map.get(chars[i]) - 1;
                isOdd = true;
            }
        }
        if(isOdd) return even_counter + 1;
        // if(even_counter == 0){
        //     return odd_counter;
        // }
        // if(odd_counter != 0){
        //     return even_counter + 1;
        // }
        return even_counter;
    }
}
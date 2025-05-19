/*
roman to numeral
*/


class Solution {
    private static Map<Character, Integer> fillMap(){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
    public int romanToInt(String s) {
        Map<Character, Integer> map = fillMap(); 
        char[] arr = s.toCharArray();
        int num = 0;
        for(int i=0; i < arr.length; i++){
            int current = map.get(arr[i]);
            if(i == arr.length - 1){
                num = num + current;
            }
            else if(current < map.get(arr[i+1])){
                num = num - current;
            }
            else{
                num = num + current;
            }
        }
        return num;
}
}
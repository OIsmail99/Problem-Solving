class Solution {
    public String firstPalindrome(String[] words) {
        //O(N*M) time complexity, not O(N2)
        for(int i = 0; i < words.length; i++){
            boolean flag = false;
            int start = 0;
            int end = words[i].length() - 1;
            for(int j = 0; j < words[i].length() && start < end; j++){
            if(words[i].charAt(start) != (words[i].charAt(end))){
                flag = true;
                break;
            }
            start++;
            end--;    
            }
            if(flag) continue;
            if(!flag) return words[i];

        }
        return "";
    }
}
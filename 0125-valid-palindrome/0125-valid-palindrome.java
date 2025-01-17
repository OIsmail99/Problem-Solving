class Solution { 
    
    public static boolean isValidChar(char c){
        char[] arr = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(c == arr[i]) return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            while(start < end && !isValidChar(str.charAt(start))){
                start++;
            }
        while(start < end && !isValidChar(str.charAt(end))){
                end--;
            }
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
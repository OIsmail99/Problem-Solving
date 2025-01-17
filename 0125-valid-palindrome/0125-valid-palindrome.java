class Solution { 
    
    public static boolean isValidChar(char c){
        char[] arr = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (high + low) / 2;
            if(c == arr[mid]) return true;
            if(c > arr[mid]) low = mid + 1;
            if(c < arr[mid]) high = mid - 1;
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
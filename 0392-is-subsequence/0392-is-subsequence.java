class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t)) return true;
        if(s.length() > t.length()) return false;
        int s_index = s.length() -1;
        int t_index = t.length() -1;
        if(s.length() ==0)return true;
        while(t_index >= 0){ //abc //ahbgdc
            if(s.charAt(s_index) == t.charAt(t_index)){
                s_index--;
                t_index--;
                if(s_index == -1) return true;
            }
            else{
                t_index--;
            }
        }
        if(s_index >=0) return false;
        return true;
    }
}
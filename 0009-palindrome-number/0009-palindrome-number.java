class Solution {
    private static int reverse(int x){
        int rev = 0;
        while(x != 0){
            int lastDigit = x % 10; //123
            rev = rev * 10 + lastDigit;
            x = x / 10;
        }
        return rev;
    }
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int intact = x;
        int reversed = reverse(x);
        System.out.println(intact);
        System.out.println(reversed);

        return intact == reversed;
    }
}
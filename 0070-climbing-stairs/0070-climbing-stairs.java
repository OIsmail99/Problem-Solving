class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1]; //array of subproblems
        dp[0] = 1; //it takes one way to climb a zero stair ladder, to not climb it.
        dp[1] = 1; //it takes one way to climb one stair
        for(int i=2; i <= n; i++){
            //the number of ways to climb a ladder that consists of i is the sum of the previous two ways.
            //, the Fibonacci sequence is a sequence in which each element is the sum of the two elements that precede it.
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
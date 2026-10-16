class Solution {
    static boolean solve(int[]arr, int k, int CurrentSum, int index, Boolean[][] dp){
        if(CurrentSum == k){
            return true;
        }
        // if(k == 0){
        //     return true;
        // }
        if(index >= arr.length && CurrentSum < k){
            return false;
        }
        if(CurrentSum > k){
            return false;
        }
        if(dp[index][CurrentSum] != null){
            return dp[index][CurrentSum];
        }
        
        boolean includeCurrentElement = solve(arr,k,CurrentSum + arr[index],index + 1, dp);
        boolean excludeCurrentElement = solve(arr,k,CurrentSum,index + 1, dp);
        dp[index][CurrentSum] = includeCurrentElement || excludeCurrentElement;
        return dp[index][CurrentSum];
        // return includeCurrentElement || excludeCurrentElement;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        int CurrentSum = 0;
        int index = 0;
        Boolean[][] dp = new Boolean[arr.length + 1][k + 1];
        boolean ans = solve(arr,k,CurrentSum,index,dp);
        return ans;
    }
}
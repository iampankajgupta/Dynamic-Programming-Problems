
Leetcode (Easy) Problem No 122

// ANOTHER APPROACH  SPACE COMPLEXITY O(1) TIME COMPLEXITY O(N)

//class Solution {
//    public int maxProfit(int[] prices) {
//        if (prices.length == 0) return 0;
//        int sum = 0;
//        int pre = prices[0];
//        for (int i : prices) {
//            if (i > pre) sum += i - pre;
//            pre = i;
//        }
//        return sum;
//    }
//}

// TIME COMPLEXITY O(N) AND SPACE COMPLEXITY O(N)

  public int maxProfit(int[] prices) {
        if (prices.length<=1){
            return 0;
        }else{
             int[] dp = new int[prices.length+1];
            dp[0] = 0;
            dp[1] = 0;
            int Amax = 2;
             for(int i = 1;i<prices.length;i++){
                 if(prices[i]>prices[i-1]){
                     dp[Amax] = dp[Amax-1]+(prices[i]-prices[i-1]);
                     Amax++;
                 }
                        
             }
            int max = 0;
            for(int i = 0;i<dp.length;i++){
                if(dp[i]>max){
                    max = dp[i];
                }
            }
            return max;
            
        } 
    }
    
    TEST CASE 
   1. [7,1,5,3,6,4]
   2. [7,5,3,1,6,4]
   3. 
   
    
    

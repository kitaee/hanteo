public class Test2 {

    public static void main(String[] args) {

        // input
        int[] coins = {2,5,3,6};
        int sum = 10;

        // solution
        System.out.println(solution(coins, sum));
    }

    public static int solution(int[] coins, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for(int coin : coins) {
            for(int j=coin; j<=sum; j++) {
                dp[j] += dp[j-coin];
            }
        }

        return dp[sum];
    }
}
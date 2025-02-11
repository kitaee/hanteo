public class Test2 {

    public static void main(String[] args) {

        // input1
        int[] coins = {1,2,3};
        int sum = 4;

        // solution1
        System.out.println(solution(coins, sum));

        // input2
        coins = new int[]{2,5,3,6};
        sum = 10;

        // solution2
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
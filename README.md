## 2번 문제
---

### 문제 설명
서로 다른 종류의 통화를 나타내는 N 크기의 coin 정수 배열과 정수 합계가 주어지면, coin[]의 다양한 조합을 사용하여 합계를 만드는 방법의 수를 찾는 것이 과제입니다.
참고: 각 유형의 동전이 무한정 공급된다고 가정합니다.

### 문제 예시
1) 입력: sum = 4, coins[] = {1,2,3}, 출력: 4 
2) 입력: sum = 10, coins[] = {2, 5, 3, 6}, 출력: 5

### 코드
```
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
```

### 풀이 방법
동적 계획법을 사용하여 O(N * sum) 시간복잡도로 문제를 해결하였습니다. dp[i]는 합계 i를 만드는 방법의 수를 저장하며, 각 동전에 대해 dp[j] += dp[j-coin]을 수행하며 모든 가능한 방법의 수를 누적합니다.

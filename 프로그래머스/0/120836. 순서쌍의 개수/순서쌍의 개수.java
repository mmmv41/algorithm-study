class Solution {
    public int solution(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // i가 n의 약수이면
                count++; // 순서쌍 (i, n/i) 추가
            }
        }
        
        return count;
    }
}

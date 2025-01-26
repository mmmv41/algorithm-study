class Solution {
    public int solution(int n) {
        // 합 = (첫번째 항 + 마지막 항) * 항의 개수 / 2
        // 마지막 항 구하기
        int last = n % 2 == 0 ? n : n - 1;
        int cnt = n / 2;
        return (2 + last) * cnt / 2;
    }
}
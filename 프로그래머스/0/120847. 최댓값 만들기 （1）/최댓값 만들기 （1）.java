import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 배열 정렬
        Arrays.sort(numbers);

        int n = numbers.length;

        // 최댓값 두 개의 곱과 최솟값 두 개의 곱 중 큰 값을 반환
        return Math.max(numbers[n - 1] * numbers[n - 2], numbers[0] * numbers[1]);
    }
}
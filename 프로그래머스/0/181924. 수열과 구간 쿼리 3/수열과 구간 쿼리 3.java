import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        // 각 쿼리에 대해 값을 교환
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            // arr[i]와 arr[j]의 값 교환
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
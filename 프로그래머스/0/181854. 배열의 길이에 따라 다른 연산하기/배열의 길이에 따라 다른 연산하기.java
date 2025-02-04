import java.util.Arrays;

class Solution {
       public static int[] solution(int[] arr, int n) {
        // 배열 길이가 홀수인지 짝수인지 확인
        boolean isOddLength = arr.length % 2 == 1;
        
        // 새로운 배열 생성 (원본 배열을 직접 수정하지 않기 위해 복사)
        int[] result = Arrays.copyOf(arr, arr.length);
        
        // 조건에 맞게 인덱스 변경
        for (int i = 0; i < result.length; i++) {
            if ((isOddLength && i % 2 == 0) || (!isOddLength && i % 2 == 1)) {
                result[i] += n;
            }
        }
        
        return result;
    }
}
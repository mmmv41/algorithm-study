import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> result = new ArrayList<>();

        for (int num : numlist) {
            if (num % n == 0) {
                result.add(num);
            }
        }

        // List → int[] 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
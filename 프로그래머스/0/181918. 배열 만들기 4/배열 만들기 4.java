import java.util.Stack;

public class Solution {
    public static int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
                i++;
            } else if (stk.peek() < arr[i]) {
                stk.push(arr[i]);
                i++;
            } else {
                stk.pop();
            }
        }

        // Stack을 배열로 변환
        int[] result = new int[stk.size()];
        for (int j = result.length - 1; j >= 0; j--) {
            result[j] = stk.pop();
        }

        return result;
    }
}
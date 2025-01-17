public class Solution {
    public static int solution(int[] num_list, int n) {
        for (int num : num_list) {
            if (num == n) {
                return 1; // n이 num_list에 있으면 1 반환
            }
        }
        return 0; // n이 num_list에 없으면 0 반환
    }
}
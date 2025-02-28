import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();

        for (String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if (num > k) {
                result.add(num);
            }
        }

        // List를 int 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
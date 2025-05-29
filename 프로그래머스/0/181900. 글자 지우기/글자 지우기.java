import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        // indices를 Set에 넣어 빠르게 확인할 수 있게 함
        Set<Integer> indexSet = new HashSet<>();
        for (int idx : indices) {
            indexSet.add(idx);
        }

        // StringBuilder를 이용하여 결과 문자열 생성
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!indexSet.contains(i)) {
                result.append(my_string.charAt(i));
            }
        }

        return result.toString();
    }
}
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>();
        int count = 0;

        // s1의 원소를 집합에 저장
        for (String str : s1) {
            set.add(str);
        }

        // s2의 원소 중 s1에 포함된 것이 있는지 확인
        for (String str : s2) {
            if (set.contains(str)) {
                count++;
            }
        }

        return count;
    }
}
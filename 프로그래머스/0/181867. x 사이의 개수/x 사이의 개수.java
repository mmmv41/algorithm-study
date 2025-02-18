import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x", -1); // 연속된 'x'와 마지막 'x'도 포함
        int[] answer = new int[arr.length]; // 크기를 arr.length로 설정
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length(); // 문자열의 길이를 저장
        } 
        return answer;
    }
}

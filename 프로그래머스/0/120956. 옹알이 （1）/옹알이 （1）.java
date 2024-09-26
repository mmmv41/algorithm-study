class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bal = {"aya", "ye", "woo", "ma"}; //제거할 문자열 패턴 저장
        String tmp = ""; //패턴 제거한 결과 저장하기 위해 사용

        for(String i : babbling){ // babbling배열 문자열 하나씩 꺼내서 i에 저장. 
            // babbling = {"aya","yee"}라면.첫번째 반복에서 i = "aya", 두번째 반복 i = "yee"
            for(String j : bal){ // bal 배열 각 패턴 하나씩 꺼내서  j에 저장. 
                // i문자열에서 bal에 있는 패턴 제거 위해 사용
                tmp = i.replace(j, " "); // i 문자열에서 j 패턴 찾아서 빈칸으로 바꾸고 tmp에 저장
                i = tmp; // 변경된 문자열 tmp를 i에 할당. "ayaye"-> 빈칸. 순차적 제거
            }
            if(i.isBlank()) answer++; // i가 빈칸이면 answer 1씩 증가
        }
        return answer;
    }   
}
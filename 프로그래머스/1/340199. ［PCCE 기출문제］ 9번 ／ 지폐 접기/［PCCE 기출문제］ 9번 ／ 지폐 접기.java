import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        Arrays.sort(wallet); // [짧은 쪽, 긴 쪽] 정렬
        Arrays.sort(bill); 
        
        while (bill[1] > wallet[1] || bill[0] > wallet[0]){ 
            // wallet에 들어갈 때 까지 접기
            bill[1] /= 2; // 긴 쪽 반 접기
            
            Arrays.sort(bill); // bill 재정렬
            
            answer ++;
        }
        return answer;
    }
}
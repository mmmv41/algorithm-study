class Solution {
    public int solution(int num, int k) {

        String str = Integer.toString(num);
        char target = Character.forDigit(k, 10);
        // "29173"에서 각각 '2','9','1','7','3'은 char 타입이므로
        // 비교할 k도 char로 같은 타입이여야한다.
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) { 
                return i + 1; 
            }
        }

        return -1;
    }
}
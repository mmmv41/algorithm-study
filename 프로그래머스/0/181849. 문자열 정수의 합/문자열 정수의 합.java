class Solution {
    public int solution(String num_str) {
        int count = 0;
        for (char c : num_str.toCharArray()) {
            count += c - '0'; // '0'의 아스키 코드(48)를 빼면 숫자가 됨
        }
        return count;
    }
}

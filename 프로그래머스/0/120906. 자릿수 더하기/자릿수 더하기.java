class Solution {
    public int solution(int n) {
        int sum = 0;
        String num = n + "";
        for (char a : num.toCharArray()){
            sum += a - '0';
        }
        return sum;
    }
}
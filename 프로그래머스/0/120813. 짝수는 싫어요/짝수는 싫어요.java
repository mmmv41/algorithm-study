class Solution {
    public int[] solution(int n) {
        int number = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[number];
        int array = 0;
        for(int i = 1; i <= n; i+= 2)
            answer[array++] = i;
        return answer;
    }
}
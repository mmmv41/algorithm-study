class Solution {
    public int[] solution(int[] numbers) {
        int[] results = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++){
            results[i] = numbers[i] * 2;   
        }
        return results;
    }
}
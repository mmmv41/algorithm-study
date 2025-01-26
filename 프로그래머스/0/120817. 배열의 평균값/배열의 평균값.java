class Solution {
    public double solution(int[] numbers) {
        int result = 0;
        for (int n : numbers)
            result += n;
        return (double) result / numbers.length ;
    }
}
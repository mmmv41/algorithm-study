class Solution {
    public int solution(int[] num_list) {
        int product = 1; 
        int sum = 0; 


        for (int num : num_list) {
            product *= num; 
            sum += num; 
        }

        int sumSquare = sum * sum;

        return product < sumSquare ? 1 : 0;
    }
}
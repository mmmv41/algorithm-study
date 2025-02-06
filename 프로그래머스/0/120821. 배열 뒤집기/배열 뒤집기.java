class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] reversed = new int[length];
        
        for (int i = 0; i < length; i++) {
            reversed[i] = num_list[length - 1 - i];
        }
        
        return reversed;
    }
}
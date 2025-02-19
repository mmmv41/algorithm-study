class Solution {
    public int solution(String number) {
        char[] c = number.toCharArray();
        int count = 0;
        for (int n : c){
            count += n - 48;
        }
        return count % 9;
    }
}
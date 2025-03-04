class Solution {
    public int solution(String my_string, String is_prefix) {
        if (my_string.length() < is_prefix.length()){
            return 0;
        }
        int length = is_prefix.length();
        
        if (my_string.substring(0,length).equals(is_prefix)){
            return 1;
        } else {
            return 0;
        }
    }
}
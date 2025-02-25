class Solution {
    public String[] solution(String[] names) {
        int size = 0;
        if (names.length % 5 != 0 && names.length > 5){
            size = names.length / 5 + 1;
        } else if (names.length % 5 == 0) {
            size = names.length / 5;
        } else {
            size = 1;
        }
        
        String[] result = new String[size];
        for (int i = 0, cnt = 0; i < names.length; i+=5, cnt++){
            result[cnt] = names[i];
        }
        return result;
    }
}
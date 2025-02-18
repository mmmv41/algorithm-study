class Solution {
    public int[] solution(String myString) {
        int length = myString.length();

        int cnt = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                cnt++;
            }
        }
        
        int[] result = new int[cnt + 1];
        
        String[] splitArray = myString.split("x");

        for (int i = 0; i < splitArray.length; i++) {
            result[i] = splitArray[i].length();
        }
        
        if (myString.charAt(length - 1) == 'x') {
            result[cnt] = 0;
        }
        return result;
    }
}
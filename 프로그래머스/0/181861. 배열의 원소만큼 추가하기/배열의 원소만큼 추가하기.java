class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        for (int i = 0; i < arr.length; i++ ){
            length += arr[i];
        }
        int[] result = new int[length];
        
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i]; j++){
                result[index++] = arr[i];
            }
        }
        return result;
    }
}
class Solution {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();

        for (char ch : rsp.toCharArray()) {
            switch (ch) {
                case '2': // 가위 → 이기려면 바위(0)
                    result.append('0');
                    break;
                case '0': // 바위 → 이기려면 보(5)
                    result.append('5');
                    break;
                case '5': // 보 → 이기려면 가위(2)
                    result.append('2');
                    break;
            }
        }

        return result.toString();
    }
}
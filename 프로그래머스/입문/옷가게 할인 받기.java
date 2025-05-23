class Solution {
    public int solution(int price) {
        if (price >= 500000) {
            return price * 80 / 100;  // 20%
        } else if (price >= 300000) {
            return price * 90 / 100;  // 10%
        } else if (price >= 100000) {
            return price * 95 / 100;  // 5%
        } else {
            return price;            // 할인 없음
        }
    }
}
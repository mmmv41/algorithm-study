class Solution {
    public int[] solution(int money) {
        int price = 5500;

        int cups = money / price;      // 아메리카노
        int change = money % price;    // 남는 돈

        return new int[]{cups, change};
    }
}
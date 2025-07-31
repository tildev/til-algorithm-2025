package programmers.lv00.l181938;

class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(a + "" + b);
        int product = 2 * a * b;

        return Math.max(ab, product);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(9, 91));
        System.out.println(solution.solution(89, 8));
    }
}
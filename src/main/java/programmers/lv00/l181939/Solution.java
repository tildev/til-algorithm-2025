package programmers.lv00.l181939;

class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(a + "" + b);
        int ba = Integer.parseInt(b + "" + a);

        return Math.max(ab, ba);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(9, 91));
        System.out.println(solution.solution(89, 8));
    }
}
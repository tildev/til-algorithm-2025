package programmers.lv00.l181937;

class Solution {
    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(98, 2));
        System.out.println(solution.solution(89, 8));
    }
}
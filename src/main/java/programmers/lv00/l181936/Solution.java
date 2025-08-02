package programmers.lv00.l181936;

class Solution {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(60, 2, 3));
        System.out.println(solution.solution(55, 10, 5));
    }
}
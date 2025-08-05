package programmers.training.lv00.l181940;

class Solution {
    public String solution(String myString, int k) {
        return myString.repeat(k);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("string", 3));
        System.out.println(solution.solution("love", 10));
    }
}
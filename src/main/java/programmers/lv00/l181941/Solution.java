package programmers.lv00.l181941;

class Solution {
    public String solution(String[] arr) {
        return String.join("", arr);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] arr = {"a", "b", "c"};
        System.out.println(solution.solution(arr));
    }
}
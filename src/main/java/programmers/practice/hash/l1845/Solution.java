package programmers.practice.hash.l1845;

import java.util.Arrays;

public class Solution {
    /*
    public int solution(int[] nums) {
        int limit = nums.length / 2;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return Math.min(limit, set.size());
    }
    */
    public int solution(int[] nums) {
        return (int) Math.min(Arrays.stream(nums).distinct().count(), nums.length / 2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 4, 5};
        System.out.println(new Solution().solution(nums));
    }
}

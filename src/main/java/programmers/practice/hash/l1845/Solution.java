package programmers.practice.hash.l1845;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] nums) {
        int limit = nums.length / 2;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return Math.min(limit, set.size());
    }
}

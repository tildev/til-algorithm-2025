package programmers.practice.hash.l42576;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /*
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }
    */
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();
        for (String p : participant) {
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            participantMap.put(c, participantMap.get(c) - 1);
        }

        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) > 0) {
                return key;
            }
        }
        return "";
    }
}

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> result = new ArrayList<>();
        int prev = -1;

        for (int num : arr) {
            if (num != prev) {
                result.add(num);
                prev = num;
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
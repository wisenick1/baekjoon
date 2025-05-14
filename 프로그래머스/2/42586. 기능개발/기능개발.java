import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {

        int[] result = new int[speeds.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
        }

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        for (int i : result) {
            queue.add(i);
        }

        int cnt = 0;
        int[] arr = new int[queue.size()];
        int index = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            cnt = 1;

            while (!queue.isEmpty() && cur >= queue.peek()) {
                queue.poll();
                cnt++;
            }

            answer.add(cnt);
        }
        return answer;
    }
}
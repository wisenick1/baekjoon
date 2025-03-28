import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;

        while(i < arr.length) {
            for (int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
            i++;
        }
        
        int[] answer = new int[list.size()];

        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);

        }
        
        return answer;
    }
}
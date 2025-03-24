import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
                
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        Set<Integer> deleteSet = new HashSet<>();
        for (int del : delete_list) {
            deleteSet.add(del);
        }
        
        for (int i = 0; i < list.size(); ) {
            if (deleteSet.contains(list.get(i))) {
                list.remove(i);
            } else {
                i++;
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}
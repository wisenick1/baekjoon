import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
                
        List<Integer> list = new ArrayList<>();
        Set<Integer> deleteSet = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        for(int i = 0; i<delete_list.length; i++) {
            deleteSet.add(delete_list[i]);
        }
        
        for(int i = 0; i < list.size();) {
            if(deleteSet.contains(list.get(i))) {
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
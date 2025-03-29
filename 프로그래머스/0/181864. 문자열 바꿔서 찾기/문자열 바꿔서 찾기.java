class Solution {
    public int solution(String myString, String pat) {
        String replace = pat.replace("A", "X");
        String replace2 = replace.replace("B", "A");
        String replace3 = replace2.replace("X", "B");
        
        return myString.contains(replace3) ? 1 : 0;
    }
}
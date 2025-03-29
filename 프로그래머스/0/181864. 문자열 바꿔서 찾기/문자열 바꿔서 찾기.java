class Solution {
    public int solution(String myString, String pat) {
        String replace = pat.replace("A", "X").replace("B", "A").replace("X", "B");
        
        return myString.contains(replace) ? 1 : 0;
    }
}
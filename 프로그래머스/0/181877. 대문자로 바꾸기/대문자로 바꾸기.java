class Solution {
    public String solution(String myString) {
        
        char[] str = myString.toCharArray();

        StringBuilder result = new StringBuilder();

        for (char c : str) {
            result.append(Character.toUpperCase(c));
        }

        return result.toString();
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        int countPlace = 0;
        int sLength = s.length();
        
        for(int i = 0; i < sLength; i++) {
            char ch = s.charAt(i);
            
            if(ch == ' '){
                answer += " ";
                countPlace = 0;
                continue;
            }
            if(countPlace%2 == 0) {
                answer += String.valueOf(Character.toUpperCase(ch));
                countPlace++;
            }
            else {
                answer += String.valueOf(Character.toLowerCase(ch));
                countPlace++;
            }
        }
        
        return answer;
    }
}
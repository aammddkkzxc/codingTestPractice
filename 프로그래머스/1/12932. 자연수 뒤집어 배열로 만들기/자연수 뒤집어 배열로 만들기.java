class Solution {
    public int[] solution(long n) {
        String parsedValue = String.valueOf(n);
        int parsedValueLength = parsedValue.length();
        int[] answer = new int[parsedValueLength];
        
        for(int i = 0; i < parsedValueLength; i++) {
            int place = parsedValueLength - (i + 1);
             answer[place] = Character.getNumericValue(parsedValue.charAt(i));
        }
        
        return answer;
    }
}
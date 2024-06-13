class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int count = 0;
        
        for (int i = 0; i < num; i++) {
            count += i;
        }
        
        int firstNumber = (total - count) / num;
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = firstNumber + i;
        }
        
        return answer;
    }
}
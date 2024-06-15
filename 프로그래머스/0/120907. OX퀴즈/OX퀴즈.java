class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] component = quiz[i].split(" ");
            int firstNumber = Integer.parseInt(component[0]);
            int secondNumber = Integer.parseInt(component[2]);
            String operator = component[1];
            int realAnswer = Integer.parseInt(component[4]);
            int expectedAnswer = 0;
            
            if (operator.equals("+")) {
                expectedAnswer = firstNumber + secondNumber;
            }
            if (operator.equals("-")) {
                expectedAnswer = firstNumber - secondNumber;
            }
            
            if (realAnswer == expectedAnswer) {
                answer[i] = "O";
            }
            if (realAnswer != expectedAnswer) {
                answer[i] = "X";
            }
            
        }
        
        return answer;
    }
}
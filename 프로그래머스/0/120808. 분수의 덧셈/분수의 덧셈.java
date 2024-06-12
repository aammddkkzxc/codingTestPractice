class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int denomAnswer = denom1 * denom2;
        int numerAnswer = numer1 * denom2 + numer2 * denom1;
        int max = 1;

        for (int i = 1; (i <= denomAnswer) && (i <= numerAnswer); i++) {
            if ((denomAnswer % i == 0) && (numerAnswer % i == 0)) {
                max = i;
            } 
        }

        answer[0] = numerAnswer / max;
        answer[1] = denomAnswer / max;

        return answer;
    }
}

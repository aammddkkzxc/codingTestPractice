class Solution {
    public int solution(String num_str) {
        int sum = 0;
        for(int i = 0; i < num_str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }
        return sum;
    }
}
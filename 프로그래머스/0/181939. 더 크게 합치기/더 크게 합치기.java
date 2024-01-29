class Solution {
    public int solution(int a, int b) {
        String value1 = a + "" + b;
        String value2 = b + "" + a;
        
        if(Integer.parseInt(value1) >= Integer.parseInt(value2)) {
            return Integer.parseInt(value1);
        }
        return Integer.parseInt(value2);
    }
}
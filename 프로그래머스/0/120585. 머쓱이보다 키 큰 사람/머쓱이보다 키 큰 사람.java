class Solution {
    public int solution(int[] array, int height) {
        int count = 0;
        for(int value : array) {
            if(height < value) {
                count++;
            }
        }
        return count;
    }
}
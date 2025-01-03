class Solution {
    public double solution(int[] arr) {
        
        double answer = 0;
        
        for(int arrList : arr) {
            answer += arrList;
        }
        answer = answer / arr.length;
        
        return answer;
    }
}
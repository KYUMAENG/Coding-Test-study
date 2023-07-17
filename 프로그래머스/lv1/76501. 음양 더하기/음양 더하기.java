class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int sum = 0;
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]==false){
                absolutes[i] = -1 * absolutes[i];
            }
            sum += absolutes[i];
        }
        answer = sum;
        return answer;
    }
}
class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i=0; i<n; i++){
            if(i%2==0){
                answer += "수";//짝수일때 "수" 출력
            }
            else
                answer += "박";//홀수일때 "박" 출력
        }
        return answer;
    }
}
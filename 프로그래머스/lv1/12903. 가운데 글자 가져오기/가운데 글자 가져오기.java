class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length()%2==1){
            answer = s.substring(s.length()/2, s.length()/2+1);//substring(0,n)은 n-1까지 출력 유의
        }
        else if(s.length()%2==0){
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.split(" ");//공백 기준으로 문자열 자르기
        
        for(int i=0; i<sp.length; i++){//공백 기준 나눈 문자열 수 만큼 반복
            if(sp[i].length() ==0) answer += " ";//자른 문자열 수가 0이면 공백 출력
            else{
                answer += sp[i].substring(0,1).toUpperCase();//첫 문자 대문자
                answer += sp[i].substring(1,sp[i].length()).toLowerCase();//나머지는 소문자
                answer += " ";//다음 문자열 전 공백 출력
            }
        }
        if(s.substring(s.length()-1, s.length()).equals(" ")) return answer;
        
        return answer.substring(0,answer.length()-1);
    }
}
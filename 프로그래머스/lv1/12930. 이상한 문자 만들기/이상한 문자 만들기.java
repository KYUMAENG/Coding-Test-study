class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");//공백포함 모든 문자 하나씩 split
        
        int idx = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {//공백일때 인덱스 초기화
                idx = 0;
            } else if(idx % 2 == 0) {//짝수 순서일때 대문자
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {//홀수 일때 소문자
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        } return answer;
    }
}
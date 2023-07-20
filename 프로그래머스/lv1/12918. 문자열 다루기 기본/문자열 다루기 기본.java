class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6){//문자열 길이가 4,6이 아닌 경우 false
            answer = false;
        }
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;//배열 원소가 0~9가 아니면 false
        }
        return answer;
    }
}
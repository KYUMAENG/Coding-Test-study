class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pInt = Long.parseLong(p);//p의 길이가 18까지 이므로 long으로 변환
        
        for(int i=0; i<=t.length()-p.length(); i++) {
        Long tss = Long.parseLong(t.substring(i, i+p.length()));
        if(pInt >= tss) {
            answer++;
        }
    }
        return answer;
    }
}
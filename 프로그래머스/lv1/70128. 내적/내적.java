class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length; i++){
            answer += a[i]*b[i]; //내적의 합 answer에 누적 합
        }
        return answer;
    }
}
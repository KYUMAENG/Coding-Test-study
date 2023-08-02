class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        //최대공약수
        while(min!=0){
            int r = max % min;
            max  = min;
            min = r;
        }
        //최소공배수
        int gcd = n*m / max;
        
        int[] answer = {max, gcd};
        return answer;
    }
}
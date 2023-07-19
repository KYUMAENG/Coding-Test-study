class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String[] arr = num_str.split(""); //문자열 나누기
        for(int i=0; i<arr.length; i++){
            answer += Integer.parseInt(arr[i]);//나눈 문자열 정수로 변환 후, answer에 누적 합
        }
        return answer;
    }
}
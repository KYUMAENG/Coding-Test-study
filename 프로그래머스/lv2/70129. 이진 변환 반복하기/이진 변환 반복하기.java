class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
 
         while(s.length() > 1) {//문자열 개수가 1개가 될때까지
 
          int cntOne = 0;//1의 개수 카운트
          for(int i=0; i<s.length(); i++) {

            if(s.charAt(i) == '0') answer[1]++;//0이 있으면 카운트
            else cntOne++;//1일때 카운트
          }

          s = Integer.toBinaryString(cntOne);//남아있는 1의 개수만큼 2진수 변환
          answer[0]++;//변환한 만큼 카운트
        }

        return answer;
        
    }
}
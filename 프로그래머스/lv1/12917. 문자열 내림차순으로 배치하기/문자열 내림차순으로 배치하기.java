import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] Chararr = s.toCharArray();//문자열s를 char단위로 1개씩 쪼갬
        Arrays.sort(Chararr);//오름차순 정렬
        
        answer = new StringBuilder(new String(Chararr)).reverse().toString();//내림차순으로 정렬 후 toString으로 해당 객체 반환
        return answer;
    }
}
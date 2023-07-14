import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        //스트림에 배열을 넣은 뒤 filter를 이용해 divisor의 나머지가 0일 경우 toArray로 배열화 한다.
          if(answer.length == 0) answer = new int[] {-1};//배열의 길이가 0이면 -1반환
          java.util.Arrays.sort(answer);//sort로 정렬
          return answer;
    }
}

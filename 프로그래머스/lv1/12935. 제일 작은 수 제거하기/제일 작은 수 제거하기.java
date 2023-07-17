
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length ==1){
            int[] answer = {-1};
            return answer;
        }//배열 길이가 1이면 -1 반환
        
        int[] answer = new int[arr.length-1];//1개빠진 길이만큼 선언
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            min = Math.min(min, arr[i]);//최솟값 찾기
        }
        int index=0;
        for(int i=0; i<arr.length;i++){
            
            if(arr[i]==min){//최솟값 원소면 생략
                continue;
            }
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){//50이상 짝수일때
            if(arr[i]>=50 && arr[i]%2==0){
                answer[i] = arr[i] / 2;
            }
            else if(arr[i]<50 && arr[i]%2==1){//50미만 홀수일때
                answer[i]= arr[i] * 2;
            }
            else{//나머지 경우(50미만 짝수, 50이상 짝수)
                answer[i]=arr[i];
            }
        }
        return answer;
    }
}
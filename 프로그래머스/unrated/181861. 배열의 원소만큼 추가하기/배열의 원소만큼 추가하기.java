class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = new int[sum];//배열 길이는 원소들의 합 길이
        
        int index=0;
        for(int i=0; i<arr.length; i++){//배열 길이 만큼
            for(int j=0; j<arr[i]; j++){//원소 수 만큼
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}
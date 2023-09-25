class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
        String str = Integer.toBinaryString(arr1[i] | arr2[i]);//arr1, arr2의 원소들을 이진수로 변경 후 비트 논리연산
            str = String.format("%"+n+"s", str);//n자리의 문자열 형태로 포맷변경, 5자리가 안되는 수의 나머지는 공백으로 채운다.
            str = str.replaceAll("1", "#");
            str = str.replaceAll("0", " ");
            answer[i] = str;
        }
        
        return answer;
    }
}
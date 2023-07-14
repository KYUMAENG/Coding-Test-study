import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        List<Integer> list1 = new ArrayList<Integer>();
        
        for(int item: arr){
            if(item %divisor == 0){
                list1.add(item);
            }
        }
        
        int listSize = list1.size();
        if(listSize == 0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[listSize];
        for(int i=0; i<listSize; ++i){
            answer[i] = list1.get(i);
        }
        return answer;
    }
}
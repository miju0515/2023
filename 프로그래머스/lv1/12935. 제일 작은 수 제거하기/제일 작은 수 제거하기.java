import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int[] answer;
        if(arr.length == 1){
            answer = new int[] {-1};
            return answer;
        }else{
           for(int i=1;i<arr.length;i++){
                min = Math.min(min,arr[i]);
            }
            answer = new int[arr.length-1];
            int count = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=min){
                    answer[count]=arr[i];
                    count++;
                }
            }
            
        }
        return answer;
    }
}
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        int last = -1;
        for(int i=0;i<arr.length;i++){
            if(!queue.isEmpty() && last!=arr[i]){
                queue.add(arr[i]);
                last = arr[i];
            }else if(queue.size()==0){
                queue.add(arr[i]);
                last = arr[i];
            }
        }
        
        int length = queue.size();
        int[] answer = new int[length];
        for(int i=0;i<length;i++){
            answer[i]=queue.poll();
        }
    
        return answer;
    }
}
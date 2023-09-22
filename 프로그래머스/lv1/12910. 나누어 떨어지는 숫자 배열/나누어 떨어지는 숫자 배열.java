import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                stack.push(arr[i]);
            }
        }
        
        if(stack.size()==0){
            answer = new int[] {-1};
        }else{
            int length = stack.size();
            answer = new int[length];
            for(int i=0;i<length;i++){
                answer[i]=stack.pop();

            }
            Arrays.sort(answer);
        }
        
        return answer;
    }
}
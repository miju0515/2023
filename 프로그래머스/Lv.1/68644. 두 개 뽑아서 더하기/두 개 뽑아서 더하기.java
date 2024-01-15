import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int result = numbers[i]+numbers[j];
                if(!list.contains(result)){
                    list.add(result);
                }   
            }
        }
        int length = list.size();
        int[] answer=new int[length];
        for(int i=0;i<length;i++){
            answer[i]=list.get(i).intValue();
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
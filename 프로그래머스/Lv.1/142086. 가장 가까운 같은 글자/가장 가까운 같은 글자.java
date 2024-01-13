import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<String> list = new ArrayList<String>();
        String[] array = s.split("");
        for(int i=0;i<array.length;i++){
            int index=list.lastIndexOf(array[i]);
            if(index==-1){
                answer[i]=-1;
            }else{
                answer[i]=i-index;
            }
            list.add(array[i]);
        }
        return answer;
    }
}
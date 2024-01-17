import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] fame = new int[k];
        Arrays.fill(fame,2001);
        int length=score.length;
        int[] answer=new int[length];
        int min=2001;
        for(int i=0;i<length;i++){
            if(i<k){
                fame[i]=score[i];
                Arrays.sort(fame);
            }else{
                if(fame[0]<score[i]){
                    fame[0]=score[i];
                    Arrays.sort(fame);
                }
            }
            answer[i]=fame[0];
        }
        return answer;
    }
}
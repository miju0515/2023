import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int length=emergency.length;
        int[] answer = new int[length];
        int[] copy = new int[length];
        for(int i=0;i<length;i++){
            copy[i]=emergency[i];
        }
        Arrays.sort(copy);
        for(int i=0;i<length;i++){
            for(int j=0;j<emergency.length;j++){
                if(emergency[i]==copy[j]){
                    answer[i]=length-j;
                }
            }
        }
        return answer;
    }
}
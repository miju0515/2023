import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        List<String> list = Arrays.asList(name);
        for(int i=0;i<photo.length;i++){
            answer[i]=0;
            for(String n : photo[i]){
                int index=list.indexOf(n);
                if(index!=-1){
                    answer[i]+=yearning[index];
                }
            }
        }
        
        return answer;
    }
}
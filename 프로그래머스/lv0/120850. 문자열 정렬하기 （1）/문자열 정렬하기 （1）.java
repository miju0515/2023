import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> list=new ArrayList();
        int length=my_string.length();
        for(int i=0;i<length;i++){
            char ch=my_string.charAt(i);
            if(!Character.isLowerCase(ch)){
                list.add((int)ch-48);
            }
        }
        answer=list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}
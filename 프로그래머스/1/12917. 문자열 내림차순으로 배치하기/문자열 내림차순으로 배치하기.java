import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] slist = s.split("");
        Arrays.sort(slist);
        for(String Sstring : slist){
            answer=Sstring+answer;
        }
        return answer;
    }
}
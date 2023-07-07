import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        int length=my_string.length();
        String[] word=new String[length];
        for(int i=0;i<length;i++){
            word[i]=my_string.substring(i,i+1).toLowerCase();
        }
        Arrays.sort(word);
        for(int i=0;i<length;i++){
            answer+=word[i];
        }
        return answer;
    }
}
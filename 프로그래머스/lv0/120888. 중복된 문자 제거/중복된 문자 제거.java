import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] word=my_string.toCharArray();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<my_string.length();i++){
            if(set.add(word[i])){
                answer+=Character.toString(word[i]);
            }
        }
        return answer;
    }
}
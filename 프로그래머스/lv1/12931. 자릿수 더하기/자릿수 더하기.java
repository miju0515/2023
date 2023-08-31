import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        String changeN = String.valueOf(n);
        for(int i=0;i<10;i++){
            count=changeN.length()-changeN.replaceAll(String.valueOf(i),"").length();
            answer += count*i;
        }
        return answer;
    }
}
import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] line = String.valueOf(n).split("");
        Arrays.sort(line);
        String result = "";
        for(int i=line.length-1;i>=0;i--){
            result+=line[i];
        }
        answer = Long.valueOf(result);
        return answer;
    }
}
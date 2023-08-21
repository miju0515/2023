import java.util.Stack;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] list = my_string.split(" ");
        for(int i=0;i<list.length;i++){
            if(list[i].equals("+")){
                answer+=Integer.valueOf(list[i+1]);
                i++;
            }else if(list[i].equals("-")){
                answer-=Integer.valueOf(list[i+1]);
                i++;
            }else{
                answer+=Integer.valueOf(list[i]);
            }
        }
        return answer;
    }
}
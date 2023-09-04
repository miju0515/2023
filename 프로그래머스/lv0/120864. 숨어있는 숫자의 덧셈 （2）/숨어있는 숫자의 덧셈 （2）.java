class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] result = my_string.split("[a-zA-Z]");
        for(int i=0;i<result.length;i++){
            if(!result[i].isEmpty()){
                answer+=Integer.parseInt(result[i]);
            }
        }
        return answer;
    }
}
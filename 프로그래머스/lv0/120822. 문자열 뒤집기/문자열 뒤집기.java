class Solution {
    public String solution(String my_string) {
        String answer = "";
        int length=my_string.length();
        for(int i=0;i<length;i++){
            answer+=my_string.substring(length-i-1,length-i);
        }
        return answer;
    }
}
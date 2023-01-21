class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int length=my_string.length();
        for(int i=0;i<length;i++){
            char letter=my_string.charAt(i);
            if(letter>=48&&letter<=57){
                answer+=letter-48;
            }
        }
        return answer;
    }
}
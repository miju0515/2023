class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        int length=my_string.length();
        for(int i=0;i<length;i++){
            String subletter=my_string.substring(i,i+1);
            if(!subletter.equals(letter)){
                answer+=subletter;
            }
        }
        return answer;
    }
}
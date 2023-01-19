class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        int length=str2.length();
        for(int i=0;i<str1.length()-length+1;i++){
            String letter=str1.substring(i,i+length);
            if(letter.equals(str2)){
                answer=1;
            }
        }
        return answer;
    }
}
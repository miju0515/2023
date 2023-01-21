class Solution {
    public String solution(String my_string) {
        String answer = "";
        int length=my_string.length();
        for(int i=0;i<length;i++){
            String letter=my_string.substring(i,i+1);
            if(letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u")){
                
            }
            else{
                    answer+=letter;
                }
        }
        return answer;
    }
}
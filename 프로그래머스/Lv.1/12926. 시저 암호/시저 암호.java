class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            // A 65 Z 90
            // a 97 z 122
            int number = (int)s.charAt(i);
            if(number<=90 && number+n>90){
                number=number+n-26;
            }else if(number>=97 &&number+n>122){
                number=number+n-26;
            }else if(number>=65){
                number+=n;
            }
            answer+=String.valueOf((char)(number));
        }
        return answer;
    }
}
class Solution {
    public int solution(String s) {
        int answer = 0;
        while(s.length()!=0){
            answer++;
            char x = s.charAt(0);
            int xcount = 1;
            int nonXcount = 0;
            
            for(int i = 1;i<s.length();i++){
                if(s.charAt(i)==x){
                    xcount++;
                }else{
                    nonXcount++;
                }
                if(xcount==nonXcount){
                    break;
                }
            }
            s=s.substring(xcount+nonXcount);
            
        }
        return answer;
    }
}
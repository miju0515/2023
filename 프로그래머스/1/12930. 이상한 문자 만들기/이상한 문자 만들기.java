class Solution {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split(" ",-1);
        for(int i=0;i<list.length;i++){
            if(i!=0){
                answer+=" ";
            }
            String word = list[i];
            String n_word="";
            for(int j=0;j<word.length();j++){
                if(j%2!=0){
                    n_word += word.substring(j,j+1).toLowerCase();
                }else{
                    n_word += word.substring(j,j+1).toUpperCase();
                }
            }
            answer+=n_word;
        }
        
        return answer;
    }
}
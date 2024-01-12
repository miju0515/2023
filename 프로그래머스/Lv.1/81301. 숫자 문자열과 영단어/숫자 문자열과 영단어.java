import java.util.*;

class Solution {
    public int solution(String s) {
        String answer = "";
        String[] Enumber = {"ze","on","tw","th","fo","fi","si","se","ei","ni"};
        List<String> EList = Arrays.asList(Enumber);
        // 숫자이면 그대로
        // 영단어면 2자리 떼서 확인하고 해당 길이만큼 제거
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)<=57){
                answer+=s.substring(i,i+1);
            }else{
                int index = EList.indexOf(s.substring(i,i+2));
                answer+=String.valueOf(index);
                if(index==1 || index ==2 || index==6){
                    i+=2;
                }else if(index==0 || index==4 || index==5 || index==9){
                    i+=3;
                }else if(index==3 || index==7 || index==8){
                    i+=4;
                }
            }
        }
        return Integer.valueOf(answer);
    }
}
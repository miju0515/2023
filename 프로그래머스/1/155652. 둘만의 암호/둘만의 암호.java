import java.util.*;

class Solution {
    public static List<Integer> skipList = new ArrayList<Integer>();
    public static int resultIndex=0;
    public static String result="";
    
    public String solution(String s, String skip, int index) {
        for(int i=0;i<skip.length();i++){
            skipList.add(Integer.valueOf(skip.charAt(i)));
        }
        
        resultIndex=index;
        int length = s.length();
        for(int i=0;i<length;i++){
            int sNumber = Integer.valueOf(s.charAt(i));
            checkString(sNumber,0);
        }
        
        return result;
    }
    
    public void checkString(int sNumber, int index){
        if(sNumber>122){
            sNumber-=26;
        }
        
        if(index==resultIndex && !skipList.contains(sNumber)){
            result+=String.valueOf((char)sNumber);
        }else if(skipList.contains(sNumber)){
            checkString(sNumber+1,index);
        }else{
            checkString(sNumber+1,index+1);
        }
    }
}
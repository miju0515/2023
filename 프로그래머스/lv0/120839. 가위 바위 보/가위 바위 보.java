class Solution {
    public String solution(String rsp) {
        String answer = "";
        int length=rsp.length();
        for(int i=0;i<length;i++){
            if(rsp.charAt(i)=='2'){
                answer+='0';
            }else if(rsp.charAt(i)=='5'){
                answer+='2';
            }else if(rsp.charAt(i)=='0'){
                answer+='5';
            }
        }
        return answer;
    }
}
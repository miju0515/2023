class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int length=cipher.length();
        int index=code;
        for(int i=1;i<=length/code;i++){
            answer+=cipher.charAt(i*code-1);
        }
        return answer;
    }
}
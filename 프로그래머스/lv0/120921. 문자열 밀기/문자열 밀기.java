class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int length = A.length();
        for(int i=0;i<length;i++){
            if(A.equals(B)){
                answer = i;
                break;
            }else{
                A = A.substring(length-1) + A.substring(0,length-1);
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int count=1;
        int result=0;
        while(num>0){
            if(num%10==k){
                result=count;
            }
            num/=10;
            count++;
        }
        if(result!=0){
            answer=count-result;
        }
        return answer;
    }
}
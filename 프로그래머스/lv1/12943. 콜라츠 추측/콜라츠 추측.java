class Solution {
    public int solution(int num) {
        int answer = 0;
        long number = Long.valueOf(num);
        while(number!=1){
            if(answer==500 && number!=1){
                answer=-1;
                break;
            }
            if(number%2==0){
                number/=2;
            }else{
                number = (number*3) + 1;
            }
            answer++;
        }
        return answer;
    }
}
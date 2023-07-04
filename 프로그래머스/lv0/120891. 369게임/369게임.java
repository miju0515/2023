class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order>0){
            int number=order%10;
            if(number!=0&&number%3==0){
                answer++;
            }
            order/=10;
        }
        return answer;
    }
}
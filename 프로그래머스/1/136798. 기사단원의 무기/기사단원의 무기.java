class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1;i<=number;i++){
            int count = 0;
            for(int j=1;j<=Math.sqrt(i);j++){
                if(count>limit){
                    break;
                }
                if(i%j==0 && i/j!=Math.sqrt(i)){
                    count+=2;
                }else if(i/j==Math.sqrt(i)){
                    count++;
                }
            }
            if(count>limit){
                answer+=power;
            }else{
                answer+=count;
            }
            
        }
        return answer;
    }
}
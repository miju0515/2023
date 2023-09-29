class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++){
            int result = aliquot(i);
            if(result%2==0){
                answer+=i;
            }else{
                answer-=i;
            }
        }
        
        return answer;
    }
    
    public int aliquot(int number){
        int count = 0;
        for(int i=1;i<=Math.sqrt(number);i++){
            if(i==Math.sqrt(number)){
                count++;
            }else if(number%i==0){
                count+=2;
            }
        }
        return count;
    }
}
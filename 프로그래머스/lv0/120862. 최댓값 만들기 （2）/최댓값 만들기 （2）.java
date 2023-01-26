class Solution {
    public int solution(int[] numbers) {
        int answer = -100000000;
        int length=numbers.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(numbers[i]*numbers[j]>answer){
                    answer=numbers[i]*numbers[j];
                }
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max=0;
        //가장 긴 변의 길이 구하기
        for(int i=0;i<3;i++){
            if(sides[i]>max){
                max=sides[i];
            }
        }
        int sum=sides[0]+sides[1]+sides[2]-max;
        if(sum>max){
            answer=1;
        }else{
            answer=2;
        }
        return answer;
    }
}
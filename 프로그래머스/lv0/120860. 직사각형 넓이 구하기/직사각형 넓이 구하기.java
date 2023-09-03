class Solution {
    public int solution(int[][] dots) {
        int a = 0;
        int b = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        for(int i=0;i<4;i++){
            if(x != dots[i][0]){
                a = Math.abs(x - dots[i][0]);
            }
            if(y != dots[i][1]){
                b = Math.abs(y - dots[i][1]);
            }
        }
        int answer = a*b;
        return answer;
    }
}
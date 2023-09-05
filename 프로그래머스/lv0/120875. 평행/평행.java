class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[][] array ={{2,3},{1,3},{1,2}};
        for(int i=0;i<3;i++){
            int a = i+1;
            int b = array[i][1];
            int c = array[i][0];
            int x1 = Math.abs(dots[a][0]-dots[0][0]);
            int y1 = Math.abs(dots[a][1]-dots[0][1]);
            int x2 = Math.abs(dots[b][0]-dots[c][0]);
            int y2 = Math.abs(dots[b][1]-dots[c][1]);
            double line1 = Math.atan2(x1,y1);
            double line2 = Math.atan2(x2,y2);
            if(line1 == line2) {
                answer = 1;
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n =board[0].length;
        int[] dx = {-1,0,1,-1,1,-1,0,1};
        int[] dy = {-1,-1,-1,0,0,1,1,1};
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==1){
                    for(int k=0;k<8;k++){
                        int posX = i+dx[k];
                        int posY = j+dy[k];
                        if(posX >= 0 && posX < n && posY >=0 && posY < n && board[posX][posY]==0){
                            board[posX][posY] = 2;
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] moving = {0,0};
        int maxpoint_w = board[0]/2;
        int maxpoint_h = board[1]/2;
        
        for(int i=0;i<keyinput.length;i++){
            if(keyinput[i].equals("up")){
                if(moving[1]<maxpoint_h){
                    moving[1]+=1;
                }
            }else if(keyinput[i].equals("down")){
                if(moving[1]>-maxpoint_h){
                    moving[1]-=1;
                }
            }else if(keyinput[i].equals("left")){
                if(moving[0]>-maxpoint_w){
                    moving[0]-=1;
                }
            }else if(keyinput[i].equals("right")){
                if(moving[0]<maxpoint_w){
                    moving[0]+=1;
                }
            }
        }
        return moving;
    }
}
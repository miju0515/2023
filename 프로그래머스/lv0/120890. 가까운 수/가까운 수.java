class Solution {
    public int solution(int[] array, int n) {
        int answer = 999;
        int minus = 101;
        
        for(int i=0;i<array.length;i++){
            int thisminus = Math.abs(array[i]-n);
            if(thisminus==minus){
                answer = Math.min(answer,array[i]);               
            }else if(thisminus<minus){
                minus = thisminus;
                answer = array[i];
            }
        }
        
        return answer;
    }
}
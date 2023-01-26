class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0,1000};
        int length=array.length;
        for(int i=0;i<length;i++){
            if(array[i]>answer[0]){
                answer[0]=array[i];
                answer[1]=i;
            }
            
        }
        return answer;
    }
}
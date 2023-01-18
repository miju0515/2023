class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int length=num_list.length;
        for(int i=0;i<length;i++){
            if(num_list[i]%2==0){
                answer[0]++;
            }else{
                answer[1]++;
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] number = s.split(" ");
        int before = 0;
        for(int i=0;i<number.length;i++){
            if(!number[i].equals("Z")){
                before = Integer.valueOf(number[i]);
                answer+=before;
            }else{
                answer-=before;
            }
        }
        return answer;
    }
}
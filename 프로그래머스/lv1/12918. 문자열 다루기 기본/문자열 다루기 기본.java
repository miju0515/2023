class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        String[] list = s.split("");
        if(list.length==4 || list.length==6){
            answer = true;
            for(int i=0;i<list.length;i++){
                if(list[i].charAt(0)<48 || list[i].charAt(0)>57){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}
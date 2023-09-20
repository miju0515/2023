class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int numbersum = 0;
        String[] split = String.valueOf(x).split("");
        for(int i=0;i<split.length;i++){
            numbersum+=Integer.parseInt(split[i]);
        }
        if(x%numbersum!=0){
            answer = false;
        }
        return answer;
    }
}
class Solution {
    public int[] solution(long n) {
        String[] list = String.valueOf(n).split("");
        int length = list.length;
        int[] answer = new int[length];
        for(int i = 0;i<length;i++){
            answer[length-i-1]=Integer.valueOf(list[i]);
        }
        return answer;
    }
}
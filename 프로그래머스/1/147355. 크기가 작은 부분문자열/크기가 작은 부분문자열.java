class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        Long number = Long.parseLong(p);
        for(int i=0;i<(t.length()-length)+1;i++){
            if(Long.parseLong(t.substring(i,i+length))<=number){
                answer++;
            }
        }
        return answer;
    }
}
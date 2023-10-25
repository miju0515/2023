class Solution {
    public int solution(int n) {
        int answer = 0;
        String result = "";
        while(n>0){
            result+=String.valueOf(n%3);
            n/=3;
        }
        String[] results = result.split("");
        int three = 1;
        for(int i=results.length-1;i>=0;i--){
            answer+=Integer.valueOf(results[i])*three;
            three*=3;
        }
        return answer;
    }
}
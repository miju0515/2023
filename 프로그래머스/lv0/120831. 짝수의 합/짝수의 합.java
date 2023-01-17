class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2!=0)
            n=n-1;
        answer=n*(n+2)/4;
        return answer;
    }
}
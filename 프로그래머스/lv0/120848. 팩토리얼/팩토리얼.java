class Solution {
    public int solution(int n) {
        int answer = 1;
        while(true){
            if(factorial(answer)>n){
                answer--;
                break;
            }
            answer++;
        }
        return answer;
    }
    public int factorial(int n){
        if(n==1) return 1;
        return factorial(n-1)*n;
    }
}
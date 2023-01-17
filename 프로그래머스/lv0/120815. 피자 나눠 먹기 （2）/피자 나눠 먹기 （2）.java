class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int a=6;
        int b=n;
        if(n>6){
            a=n;
            b=6;
        }
            
        answer=a*b/gcd(a,b)/6;
        return answer;
    }
    
    public int gcd(int a,int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
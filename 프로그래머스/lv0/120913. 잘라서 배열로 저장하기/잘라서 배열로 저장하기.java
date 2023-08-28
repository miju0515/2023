class Solution {
    public String[] solution(String my_str, int n) {
        int N;
        if(my_str.length() % n == 0){
            N = my_str.length() / n;
        }else{
            N = my_str.length() / n + 1;
        }
        String[] answer = new String[N];
        for(int i = 0;i < N;i++){
            if(my_str.length() <= n){
                answer[i] = my_str;
            }else{
                answer[i] = my_str.substring(0,n);
                my_str = my_str.substring(n);
            }

        }
        return answer;
    }
}
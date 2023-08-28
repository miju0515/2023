class Solution {
    public String[] solution(String[] quiz) {
        int N = quiz.length;
        String[][] problem = new String[N][5];
        String[] answer = new String[N];
        
        for(int i=0;i<N;i++){
            problem[i]=quiz[i].split(" ");
            int a = Integer.valueOf(problem[i][0]);
            int b = Integer.valueOf(problem[i][2]);
            if(problem[i][1].equals("+") && String.valueOf(a+b).equals(problem[i][4])){
                answer[i]="O";

            }else if(problem[i][1].equals("-") && String.valueOf(a-b).equals(problem[i][4])){
                answer[i]="O";
            }else{
                answer[i]="X";
            }
        }
        
        return answer;
    }
}
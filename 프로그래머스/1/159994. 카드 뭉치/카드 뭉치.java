class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int first = 0;
        int second = 0;
        int length = goal.length;
        for(int i=0;i<length;i++){
            if(first<cards1.length && goal[i].equals(cards1[first])){
                first++;
            }else if(second<cards2.length && goal[i].equals(cards2[second])){
                second++;
            }else{
                answer="No";
                break;
            }
        }
        return answer;
    }
}
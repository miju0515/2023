import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> divide = new ArrayList<>();
        int length=numlist.length;
        for(int i=0;i<length;i++){
            if(numlist[i]%n==0){
                divide.add(numlist[i]);
            }
        }
        
        answer=divide.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
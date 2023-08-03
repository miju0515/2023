import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int[] numbers, int k) {
        int answer=0;
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<numbers.length;i++){
            que.add(numbers[i]);
        }
        int count=1;
        do{
            que.add(que.poll());
            que.add(que.poll());
            count++;
        }while(count!=k);
        answer=que.peek();
        return answer;
    }
}
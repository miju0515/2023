import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        int length=numbers.length;
        ArrayList<Integer> list=new ArrayList(length);
        if(direction.equals("right")){
            list.add(numbers[length-1]);
            for(int i=0;i<length-1;i++){
                list.add(numbers[i]);
            }
        }else{
            for(int i=1;i<length;i++){
                list.add(numbers[i]);
            }
            list.add(numbers[0]);
        }
        answer=list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
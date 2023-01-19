import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        int length=array.length;
        int[] count=new int[1000];
        for(int i=0;i<length;i++){
            count[array[i]]++;
        }
        
        int max=0;
        for(int i=0;i<1000;i++){
            if(count[i]>max){
                answer=i;
                max=count[i];
            }
        }
        
        for(int i=0;i<1000;i++){
            if(i!=answer&&count[i]==max){
                answer=-1;
            }
        }
        return answer;
    }
}
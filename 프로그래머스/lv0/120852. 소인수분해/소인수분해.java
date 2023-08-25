import java.util.TreeSet;
class Solution {
    public TreeSet solution(int n) {
        TreeSet<Integer> answer = new TreeSet<Integer>();
        for(int i=2;i<=n;i++){
            while(n%i==0){
                n/=i;
                answer.add(i);
            }
        }
        return answer;
    }
}